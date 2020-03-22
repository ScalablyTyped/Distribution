package typings.qunitDom.assertionsMod

import typings.qunitDom.mod._Global_.Assert
import typings.std.Document_
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qunit-dom/dist/assertions", JSImport.Default)
@js.native
class default protected () extends DOMAssertions {
  def this(target: String, rootElement: Document_, testContext: Assert) = this()
  def this(target: String, rootElement: Element, testContext: Assert) = this()
  def this(target: Null, rootElement: Document_, testContext: Assert) = this()
  def this(target: Null, rootElement: Element, testContext: Assert) = this()
  def this(target: Element, rootElement: Document_, testContext: Assert) = this()
  def this(target: Element, rootElement: Element, testContext: Assert) = this()
}

