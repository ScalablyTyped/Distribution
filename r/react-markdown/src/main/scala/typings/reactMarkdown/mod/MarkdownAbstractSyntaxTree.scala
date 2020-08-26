package typings.reactMarkdown.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkdownAbstractSyntaxTree extends js.Object {
  var align: js.UndefOr[js.Array[AlignType]] = js.native
  var alt: js.UndefOr[String | Null] = js.native
  var checked: js.UndefOr[Boolean | Null] = js.native
  var children: js.UndefOr[js.Array[MarkdownAbstractSyntaxTree]] = js.native
  var data: js.UndefOr[StringDictionary[js.Any]] = js.native
  var depth: js.UndefOr[Double] = js.native
  var height: js.UndefOr[Double] = js.native
  var identifier: js.UndefOr[String] = js.native
  var index: js.UndefOr[Double] = js.native
  var lang: js.UndefOr[String | Null] = js.native
  var loose: js.UndefOr[Boolean] = js.native
  var ordered: js.UndefOr[Boolean] = js.native
  var position: js.UndefOr[Position] = js.native
  var referenceType: js.UndefOr[ReferenceType] = js.native
  var start: js.UndefOr[Double | Null] = js.native
  var title: js.UndefOr[String | Null] = js.native
  var `type`: String = js.native
  var url: js.UndefOr[String] = js.native
  var value: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object MarkdownAbstractSyntaxTree {
  @scala.inline
  def apply(`type`: String): MarkdownAbstractSyntaxTree = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkdownAbstractSyntaxTree]
  }
  @scala.inline
  implicit class MarkdownAbstractSyntaxTreeOps[Self <: MarkdownAbstractSyntaxTree] (val x: Self) extends AnyVal {
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlignVarargs(value: AlignType*): Self = this.set("align", js.Array(value :_*))
    @scala.inline
    def setAlign(value: js.Array[AlignType]): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def setAltNull: Self = this.set("alt", null)
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setCheckedNull: Self = this.set("checked", null)
    @scala.inline
    def setChildrenVarargs(value: MarkdownAbstractSyntaxTree*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[MarkdownAbstractSyntaxTree]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setData(value: StringDictionary[js.Any]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setIdentifier(value: String): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    @scala.inline
    def setLangNull: Self = this.set("lang", null)
    @scala.inline
    def setLoose(value: Boolean): Self = this.set("loose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoose: Self = this.set("loose", js.undefined)
    @scala.inline
    def setOrdered(value: Boolean): Self = this.set("ordered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrdered: Self = this.set("ordered", js.undefined)
    @scala.inline
    def setPosition(value: Position): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setReferenceType(value: ReferenceType): Self = this.set("referenceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceType: Self = this.set("referenceType", js.undefined)
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setStartNull: Self = this.set("start", null)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTitleNull: Self = this.set("title", null)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

