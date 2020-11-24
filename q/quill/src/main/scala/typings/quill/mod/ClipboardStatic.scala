package typings.quill.mod

import typings.quill.anon.Html
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClipboardStatic extends js.Object {
  
  def addMatcher(selectorOrNodeType: ClipboardMatcherNode, callback: ClipboardMatcherCallback): Unit = js.native
  
  def convert(): js.Any = js.native
  def convert(content: js.UndefOr[scala.Nothing], formats: StringMap): js.Any = js.native
  def convert(content: Html): js.Any = js.native
  def convert(content: Html, formats: StringMap): js.Any = js.native
  
  def dangerouslyPasteHTML(html: String): Unit = js.native
  def dangerouslyPasteHTML(html: String, source: Sources): Unit = js.native
  def dangerouslyPasteHTML(index: Double, html: String): Unit = js.native
  def dangerouslyPasteHTML(index: Double, html: String, source: Sources): Unit = js.native
  
  var matchers: js.Array[js.Tuple2[ClipboardMatcherNode, ClipboardMatcherCallback]] = js.native
}
