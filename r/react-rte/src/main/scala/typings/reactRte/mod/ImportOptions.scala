package typings.reactRte.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import typings.std.HTMLBodyElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportOptions extends js.Object {
  var customBlockFn: js.UndefOr[CustomBlockFn] = js.native
  var customInlineFn: js.UndefOr[CustomInlineFn] = js.native
  var elementStyles: js.UndefOr[StringDictionary[String]] = js.native
  var parser: js.UndefOr[js.Function1[/* html */ String, HTMLBodyElement]] = js.native
}

object ImportOptions {
  @scala.inline
  def apply(): ImportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportOptions]
  }
  @scala.inline
  implicit class ImportOptionsOps[Self <: ImportOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCustomBlockFn(value: /* element */ Element => js.UndefOr[Null | CustomBlockObject]): Self = this.set("customBlockFn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCustomBlockFn: Self = this.set("customBlockFn", js.undefined)
    @scala.inline
    def setCustomInlineFn(
      value: (/* element */ Element, /* inlineCreators */ InlineCreators) => js.UndefOr[
          Null | Style | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify draftjs.EntityInstance */ js.Any)
        ]
    ): Self = this.set("customInlineFn", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCustomInlineFn: Self = this.set("customInlineFn", js.undefined)
    @scala.inline
    def setElementStyles(value: StringDictionary[String]): Self = this.set("elementStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElementStyles: Self = this.set("elementStyles", js.undefined)
    @scala.inline
    def setParser(value: /* html */ String => HTMLBodyElement): Self = this.set("parser", js.Any.fromFunction1(value))
    @scala.inline
    def deleteParser: Self = this.set("parser", js.undefined)
  }
  
}

