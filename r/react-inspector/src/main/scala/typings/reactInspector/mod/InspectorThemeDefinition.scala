package typings.reactInspector.mod

import typings.csstype.mod.BackgroundColorProperty
import typings.csstype.mod.BackgroundImageProperty
import typings.csstype.mod.BackgroundSizeProperty
import typings.csstype.mod.BorderColorProperty
import typings.csstype.mod.ColorProperty
import typings.csstype.mod.FontFamilyProperty
import typings.csstype.mod.FontSizeProperty
import typings.csstype.mod.LineHeightProperty
import typings.csstype.mod.MarginRightProperty
import typings.csstype.mod.PaddingLeftProperty
import typings.csstype.mod.TextTransformProperty
import typings.reactInspector.reactInspectorNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InspectorThemeDefinition extends InspectorTheme {
  
  var ARROW_ANIMATION_DURATION: String = js.native
  
  var ARROW_COLOR: js.UndefOr[ColorProperty] = js.native
  
  var ARROW_FONT_SIZE: js.UndefOr[FontSizeProperty[String | `0`]] = js.native
  
  var ARROW_MARGIN_RIGHT: js.UndefOr[MarginRightProperty[String | `0`]] = js.native
  
  var BASE_BACKGROUND_COLOR: js.UndefOr[BackgroundColorProperty] = js.native
  
  var BASE_COLOR: js.UndefOr[ColorProperty] = js.native
  
  var BASE_FONT_FAMILY: js.UndefOr[FontFamilyProperty] = js.native
  
  var BASE_FONT_SIZE: js.UndefOr[FontSizeProperty[String | `0`]] = js.native
  
  var BASE_LINE_HEIGHT: js.UndefOr[LineHeightProperty[String | `0`]] = js.native
  
  var HTML_ATTRIBUTE_NAME_COLOR: js.UndefOr[ColorProperty] = js.native
  
  var HTML_ATTRIBUTE_VALUE_COLOR: js.UndefOr[ColorProperty] = js.native
  
  var HTML_COMMENT_COLOR: js.UndefOr[ColorProperty] = js.native
  
  var HTML_DOCTYPE_COLOR: js.UndefOr[ColorProperty] = js.native
  
  var HTML_TAGNAME_COLOR: js.UndefOr[ColorProperty] = js.native
  
  var HTML_TAGNAME_TEXT_TRANSFORM: js.UndefOr[TextTransformProperty] = js.native
  
  var HTML_TAG_COLOR: js.UndefOr[ColorProperty] = js.native
  
  var OBJECT_NAME_COLOR: js.UndefOr[ColorProperty] = js.native
  
  var OBJECT_PREVIEW_ARRAY_MAX_PROPERTIES: Double = js.native
  
  var OBJECT_PREVIEW_OBJECT_MAX_PROPERTIES: Double = js.native
  
  var OBJECT_VALUE_BOOLEAN_COLOR: js.UndefOr[ColorProperty] = js.native
  
  var OBJECT_VALUE_FUNCTION_PREFIX_COLOR: js.UndefOr[ColorProperty] = js.native
  
  var OBJECT_VALUE_NULL_COLOR: js.UndefOr[ColorProperty] = js.native
  
  var OBJECT_VALUE_NUMBER_COLOR: js.UndefOr[ColorProperty] = js.native
  
  var OBJECT_VALUE_REGEXP_COLOR: js.UndefOr[ColorProperty] = js.native
  
  var OBJECT_VALUE_STRING_COLOR: js.UndefOr[ColorProperty] = js.native
  
  var OBJECT_VALUE_SYMBOL_COLOR: js.UndefOr[ColorProperty] = js.native
  
  var OBJECT_VALUE_UNDEFINED_COLOR: js.UndefOr[ColorProperty] = js.native
  
  var TABLE_BORDER_COLOR: js.UndefOr[BorderColorProperty] = js.native
  
  var TABLE_DATA_BACKGROUND_IMAGE: js.UndefOr[BackgroundImageProperty] = js.native
  
  var TABLE_DATA_BACKGROUND_SIZE: js.UndefOr[BackgroundSizeProperty[String | `0`]] = js.native
  
  var TABLE_SORT_ICON_COLOR: js.UndefOr[ColorProperty] = js.native
  
  var TABLE_TH_BACKGROUND_COLOR: js.UndefOr[BackgroundColorProperty] = js.native
  
  var TABLE_TH_HOVER_COLOR: js.UndefOr[ColorProperty] = js.native
  
  var TREENODE_FONT_FAMILY: js.UndefOr[FontFamilyProperty] = js.native
  
  var TREENODE_FONT_SIZE: js.UndefOr[FontSizeProperty[String | `0`]] = js.native
  
  var TREENODE_LINE_HEIGHT: js.UndefOr[LineHeightProperty[String | `0`]] = js.native
  
  var TREENODE_PADDING_LEFT: js.UndefOr[PaddingLeftProperty[String | `0`]] = js.native
}
object InspectorThemeDefinition {
  
  @scala.inline
  def apply(
    ARROW_ANIMATION_DURATION: String,
    OBJECT_PREVIEW_ARRAY_MAX_PROPERTIES: Double,
    OBJECT_PREVIEW_OBJECT_MAX_PROPERTIES: Double
  ): InspectorThemeDefinition = {
    val __obj = js.Dynamic.literal(ARROW_ANIMATION_DURATION = ARROW_ANIMATION_DURATION.asInstanceOf[js.Any], OBJECT_PREVIEW_ARRAY_MAX_PROPERTIES = OBJECT_PREVIEW_ARRAY_MAX_PROPERTIES.asInstanceOf[js.Any], OBJECT_PREVIEW_OBJECT_MAX_PROPERTIES = OBJECT_PREVIEW_OBJECT_MAX_PROPERTIES.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectorThemeDefinition]
  }
  
  @scala.inline
  implicit class InspectorThemeDefinitionOps[Self <: InspectorThemeDefinition] (val x: Self) extends AnyVal {
    
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
    def setARROW_ANIMATION_DURATION(value: String): Self = this.set("ARROW_ANIMATION_DURATION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOBJECT_PREVIEW_ARRAY_MAX_PROPERTIES(value: Double): Self = this.set("OBJECT_PREVIEW_ARRAY_MAX_PROPERTIES", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOBJECT_PREVIEW_OBJECT_MAX_PROPERTIES(value: Double): Self = this.set("OBJECT_PREVIEW_OBJECT_MAX_PROPERTIES", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARROW_COLOR(value: ColorProperty): Self = this.set("ARROW_COLOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteARROW_COLOR: Self = this.set("ARROW_COLOR", js.undefined)
    
    @scala.inline
    def setARROW_FONT_SIZE(value: FontSizeProperty[String | `0`]): Self = this.set("ARROW_FONT_SIZE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteARROW_FONT_SIZE: Self = this.set("ARROW_FONT_SIZE", js.undefined)
    
    @scala.inline
    def setARROW_MARGIN_RIGHT(value: MarginRightProperty[String | `0`]): Self = this.set("ARROW_MARGIN_RIGHT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteARROW_MARGIN_RIGHT: Self = this.set("ARROW_MARGIN_RIGHT", js.undefined)
    
    @scala.inline
    def setBASE_BACKGROUND_COLOR(value: BackgroundColorProperty): Self = this.set("BASE_BACKGROUND_COLOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBASE_BACKGROUND_COLOR: Self = this.set("BASE_BACKGROUND_COLOR", js.undefined)
    
    @scala.inline
    def setBASE_COLOR(value: ColorProperty): Self = this.set("BASE_COLOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBASE_COLOR: Self = this.set("BASE_COLOR", js.undefined)
    
    @scala.inline
    def setBASE_FONT_FAMILY(value: FontFamilyProperty): Self = this.set("BASE_FONT_FAMILY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBASE_FONT_FAMILY: Self = this.set("BASE_FONT_FAMILY", js.undefined)
    
    @scala.inline
    def setBASE_FONT_SIZE(value: FontSizeProperty[String | `0`]): Self = this.set("BASE_FONT_SIZE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBASE_FONT_SIZE: Self = this.set("BASE_FONT_SIZE", js.undefined)
    
    @scala.inline
    def setBASE_LINE_HEIGHT(value: LineHeightProperty[String | `0`]): Self = this.set("BASE_LINE_HEIGHT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBASE_LINE_HEIGHT: Self = this.set("BASE_LINE_HEIGHT", js.undefined)
    
    @scala.inline
    def setHTML_ATTRIBUTE_NAME_COLOR(value: ColorProperty): Self = this.set("HTML_ATTRIBUTE_NAME_COLOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHTML_ATTRIBUTE_NAME_COLOR: Self = this.set("HTML_ATTRIBUTE_NAME_COLOR", js.undefined)
    
    @scala.inline
    def setHTML_ATTRIBUTE_VALUE_COLOR(value: ColorProperty): Self = this.set("HTML_ATTRIBUTE_VALUE_COLOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHTML_ATTRIBUTE_VALUE_COLOR: Self = this.set("HTML_ATTRIBUTE_VALUE_COLOR", js.undefined)
    
    @scala.inline
    def setHTML_COMMENT_COLOR(value: ColorProperty): Self = this.set("HTML_COMMENT_COLOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHTML_COMMENT_COLOR: Self = this.set("HTML_COMMENT_COLOR", js.undefined)
    
    @scala.inline
    def setHTML_DOCTYPE_COLOR(value: ColorProperty): Self = this.set("HTML_DOCTYPE_COLOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHTML_DOCTYPE_COLOR: Self = this.set("HTML_DOCTYPE_COLOR", js.undefined)
    
    @scala.inline
    def setHTML_TAGNAME_COLOR(value: ColorProperty): Self = this.set("HTML_TAGNAME_COLOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHTML_TAGNAME_COLOR: Self = this.set("HTML_TAGNAME_COLOR", js.undefined)
    
    @scala.inline
    def setHTML_TAGNAME_TEXT_TRANSFORM(value: TextTransformProperty): Self = this.set("HTML_TAGNAME_TEXT_TRANSFORM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHTML_TAGNAME_TEXT_TRANSFORM: Self = this.set("HTML_TAGNAME_TEXT_TRANSFORM", js.undefined)
    
    @scala.inline
    def setHTML_TAG_COLOR(value: ColorProperty): Self = this.set("HTML_TAG_COLOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHTML_TAG_COLOR: Self = this.set("HTML_TAG_COLOR", js.undefined)
    
    @scala.inline
    def setOBJECT_NAME_COLOR(value: ColorProperty): Self = this.set("OBJECT_NAME_COLOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOBJECT_NAME_COLOR: Self = this.set("OBJECT_NAME_COLOR", js.undefined)
    
    @scala.inline
    def setOBJECT_VALUE_BOOLEAN_COLOR(value: ColorProperty): Self = this.set("OBJECT_VALUE_BOOLEAN_COLOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOBJECT_VALUE_BOOLEAN_COLOR: Self = this.set("OBJECT_VALUE_BOOLEAN_COLOR", js.undefined)
    
    @scala.inline
    def setOBJECT_VALUE_FUNCTION_PREFIX_COLOR(value: ColorProperty): Self = this.set("OBJECT_VALUE_FUNCTION_PREFIX_COLOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOBJECT_VALUE_FUNCTION_PREFIX_COLOR: Self = this.set("OBJECT_VALUE_FUNCTION_PREFIX_COLOR", js.undefined)
    
    @scala.inline
    def setOBJECT_VALUE_NULL_COLOR(value: ColorProperty): Self = this.set("OBJECT_VALUE_NULL_COLOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOBJECT_VALUE_NULL_COLOR: Self = this.set("OBJECT_VALUE_NULL_COLOR", js.undefined)
    
    @scala.inline
    def setOBJECT_VALUE_NUMBER_COLOR(value: ColorProperty): Self = this.set("OBJECT_VALUE_NUMBER_COLOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOBJECT_VALUE_NUMBER_COLOR: Self = this.set("OBJECT_VALUE_NUMBER_COLOR", js.undefined)
    
    @scala.inline
    def setOBJECT_VALUE_REGEXP_COLOR(value: ColorProperty): Self = this.set("OBJECT_VALUE_REGEXP_COLOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOBJECT_VALUE_REGEXP_COLOR: Self = this.set("OBJECT_VALUE_REGEXP_COLOR", js.undefined)
    
    @scala.inline
    def setOBJECT_VALUE_STRING_COLOR(value: ColorProperty): Self = this.set("OBJECT_VALUE_STRING_COLOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOBJECT_VALUE_STRING_COLOR: Self = this.set("OBJECT_VALUE_STRING_COLOR", js.undefined)
    
    @scala.inline
    def setOBJECT_VALUE_SYMBOL_COLOR(value: ColorProperty): Self = this.set("OBJECT_VALUE_SYMBOL_COLOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOBJECT_VALUE_SYMBOL_COLOR: Self = this.set("OBJECT_VALUE_SYMBOL_COLOR", js.undefined)
    
    @scala.inline
    def setOBJECT_VALUE_UNDEFINED_COLOR(value: ColorProperty): Self = this.set("OBJECT_VALUE_UNDEFINED_COLOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOBJECT_VALUE_UNDEFINED_COLOR: Self = this.set("OBJECT_VALUE_UNDEFINED_COLOR", js.undefined)
    
    @scala.inline
    def setTABLE_BORDER_COLOR(value: BorderColorProperty): Self = this.set("TABLE_BORDER_COLOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTABLE_BORDER_COLOR: Self = this.set("TABLE_BORDER_COLOR", js.undefined)
    
    @scala.inline
    def setTABLE_DATA_BACKGROUND_IMAGE(value: BackgroundImageProperty): Self = this.set("TABLE_DATA_BACKGROUND_IMAGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTABLE_DATA_BACKGROUND_IMAGE: Self = this.set("TABLE_DATA_BACKGROUND_IMAGE", js.undefined)
    
    @scala.inline
    def setTABLE_DATA_BACKGROUND_SIZE(value: BackgroundSizeProperty[String | `0`]): Self = this.set("TABLE_DATA_BACKGROUND_SIZE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTABLE_DATA_BACKGROUND_SIZE: Self = this.set("TABLE_DATA_BACKGROUND_SIZE", js.undefined)
    
    @scala.inline
    def setTABLE_SORT_ICON_COLOR(value: ColorProperty): Self = this.set("TABLE_SORT_ICON_COLOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTABLE_SORT_ICON_COLOR: Self = this.set("TABLE_SORT_ICON_COLOR", js.undefined)
    
    @scala.inline
    def setTABLE_TH_BACKGROUND_COLOR(value: BackgroundColorProperty): Self = this.set("TABLE_TH_BACKGROUND_COLOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTABLE_TH_BACKGROUND_COLOR: Self = this.set("TABLE_TH_BACKGROUND_COLOR", js.undefined)
    
    @scala.inline
    def setTABLE_TH_HOVER_COLOR(value: ColorProperty): Self = this.set("TABLE_TH_HOVER_COLOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTABLE_TH_HOVER_COLOR: Self = this.set("TABLE_TH_HOVER_COLOR", js.undefined)
    
    @scala.inline
    def setTREENODE_FONT_FAMILY(value: FontFamilyProperty): Self = this.set("TREENODE_FONT_FAMILY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTREENODE_FONT_FAMILY: Self = this.set("TREENODE_FONT_FAMILY", js.undefined)
    
    @scala.inline
    def setTREENODE_FONT_SIZE(value: FontSizeProperty[String | `0`]): Self = this.set("TREENODE_FONT_SIZE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTREENODE_FONT_SIZE: Self = this.set("TREENODE_FONT_SIZE", js.undefined)
    
    @scala.inline
    def setTREENODE_LINE_HEIGHT(value: LineHeightProperty[String | `0`]): Self = this.set("TREENODE_LINE_HEIGHT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTREENODE_LINE_HEIGHT: Self = this.set("TREENODE_LINE_HEIGHT", js.undefined)
    
    @scala.inline
    def setTREENODE_PADDING_LEFT(value: PaddingLeftProperty[String | `0`]): Self = this.set("TREENODE_PADDING_LEFT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTREENODE_PADDING_LEFT: Self = this.set("TREENODE_PADDING_LEFT", js.undefined)
  }
}
