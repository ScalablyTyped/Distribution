package typings
package quillLib.quillMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClipboardStatic extends js.Object {
  def addMatcher(
    selectorOrNodeType: java.lang.String,
    callback: js.Function2[
      /* node */ js.Any, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Delta */ /* delta */ js.Any, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Delta */ _
    ]
  ): scala.Unit = js.native
  def addMatcher(
    selectorOrNodeType: scala.Double,
    callback: js.Function2[
      /* node */ js.Any, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Delta */ /* delta */ js.Any, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Delta */ _
    ]
  ): scala.Unit = js.native
  def convert(): js.Any = js.native
  def convert(html: java.lang.String): js.Any = js.native
  def dangerouslyPasteHTML(html: java.lang.String): scala.Unit = js.native
  def dangerouslyPasteHTML(html: java.lang.String, source: Sources): scala.Unit = js.native
  def dangerouslyPasteHTML(index: scala.Double, html: java.lang.String): scala.Unit = js.native
  def dangerouslyPasteHTML(index: scala.Double, html: java.lang.String, source: Sources): scala.Unit = js.native
}

