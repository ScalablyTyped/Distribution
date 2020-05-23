package typings.qunitDom.assertionsMod

import typings.qunitDom.mod.global.Assert
import typings.std.Document
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qunit-dom/dist/assertions", JSImport.Default)
@js.native
class default protected () extends DOMAssertions {
  def this(target: String, rootElement: Document, testContext: Assert) = this()
  def this(target: String, rootElement: Element, testContext: Assert) = this()
  def this(target: Null, rootElement: Document, testContext: Assert) = this()
  def this(target: Null, rootElement: Element, testContext: Assert) = this()
  def this(target: Element, rootElement: Document, testContext: Assert) = this()
  def this(target: Element, rootElement: Element, testContext: Assert) = this()
}

