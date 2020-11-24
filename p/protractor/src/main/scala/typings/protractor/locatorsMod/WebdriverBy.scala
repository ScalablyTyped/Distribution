package typings.protractor.locatorsMod

import typings.seleniumWebdriver.mod.By
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("protractor/built/locators", "WebdriverBy")
@js.native
class WebdriverBy () extends js.Object {
  
  def className(className: String): By = js.native
  
  def css(css: String): By = js.native
  
  def id(id: String): By = js.native
  
  @JSName("js")
  def js_(js_ : String, var_args: js.Any*): By = js.native
  @JSName("js")
  def js_(js_ : js.Function, var_args: js.Any*): By = js.native
  
  def linkText(linkText: String): By = js.native
  
  def name(name: String): By = js.native
  
  def partialLinkText(partialText: String): By = js.native
  
  def tagName(tagName: String): By = js.native
  
  def xpath(xpath: String): By = js.native
}
