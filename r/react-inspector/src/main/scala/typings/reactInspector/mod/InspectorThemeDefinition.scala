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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InspectorThemeDefinition
  extends StObject
     with InspectorTheme {
  
  var ARROW_ANIMATION_DURATION: String
  
  var ARROW_COLOR: js.UndefOr[ColorProperty] = js.undefined
  
  var ARROW_FONT_SIZE: js.UndefOr[FontSizeProperty[String | `0`]] = js.undefined
  
  var ARROW_MARGIN_RIGHT: js.UndefOr[MarginRightProperty[String | `0`]] = js.undefined
  
  var BASE_BACKGROUND_COLOR: js.UndefOr[BackgroundColorProperty] = js.undefined
  
  var BASE_COLOR: js.UndefOr[ColorProperty] = js.undefined
  
  var BASE_FONT_FAMILY: js.UndefOr[FontFamilyProperty] = js.undefined
  
  var BASE_FONT_SIZE: js.UndefOr[FontSizeProperty[String | `0`]] = js.undefined
  
  var BASE_LINE_HEIGHT: js.UndefOr[LineHeightProperty[String | `0`]] = js.undefined
  
  var HTML_ATTRIBUTE_NAME_COLOR: js.UndefOr[ColorProperty] = js.undefined
  
  var HTML_ATTRIBUTE_VALUE_COLOR: js.UndefOr[ColorProperty] = js.undefined
  
  var HTML_COMMENT_COLOR: js.UndefOr[ColorProperty] = js.undefined
  
  var HTML_DOCTYPE_COLOR: js.UndefOr[ColorProperty] = js.undefined
  
  var HTML_TAGNAME_COLOR: js.UndefOr[ColorProperty] = js.undefined
  
  var HTML_TAGNAME_TEXT_TRANSFORM: js.UndefOr[TextTransformProperty] = js.undefined
  
  var HTML_TAG_COLOR: js.UndefOr[ColorProperty] = js.undefined
  
  var OBJECT_NAME_COLOR: js.UndefOr[ColorProperty] = js.undefined
  
  var OBJECT_PREVIEW_ARRAY_MAX_PROPERTIES: Double
  
  var OBJECT_PREVIEW_OBJECT_MAX_PROPERTIES: Double
  
  var OBJECT_VALUE_BOOLEAN_COLOR: js.UndefOr[ColorProperty] = js.undefined
  
  var OBJECT_VALUE_FUNCTION_PREFIX_COLOR: js.UndefOr[ColorProperty] = js.undefined
  
  var OBJECT_VALUE_NULL_COLOR: js.UndefOr[ColorProperty] = js.undefined
  
  var OBJECT_VALUE_NUMBER_COLOR: js.UndefOr[ColorProperty] = js.undefined
  
  var OBJECT_VALUE_REGEXP_COLOR: js.UndefOr[ColorProperty] = js.undefined
  
  var OBJECT_VALUE_STRING_COLOR: js.UndefOr[ColorProperty] = js.undefined
  
  var OBJECT_VALUE_SYMBOL_COLOR: js.UndefOr[ColorProperty] = js.undefined
  
  var OBJECT_VALUE_UNDEFINED_COLOR: js.UndefOr[ColorProperty] = js.undefined
  
  var TABLE_BORDER_COLOR: js.UndefOr[BorderColorProperty] = js.undefined
  
  var TABLE_DATA_BACKGROUND_IMAGE: js.UndefOr[BackgroundImageProperty] = js.undefined
  
  var TABLE_DATA_BACKGROUND_SIZE: js.UndefOr[BackgroundSizeProperty[String | `0`]] = js.undefined
  
  var TABLE_SORT_ICON_COLOR: js.UndefOr[ColorProperty] = js.undefined
  
  var TABLE_TH_BACKGROUND_COLOR: js.UndefOr[BackgroundColorProperty] = js.undefined
  
  var TABLE_TH_HOVER_COLOR: js.UndefOr[ColorProperty] = js.undefined
  
  var TREENODE_FONT_FAMILY: js.UndefOr[FontFamilyProperty] = js.undefined
  
  var TREENODE_FONT_SIZE: js.UndefOr[FontSizeProperty[String | `0`]] = js.undefined
  
  var TREENODE_LINE_HEIGHT: js.UndefOr[LineHeightProperty[String | `0`]] = js.undefined
  
  var TREENODE_PADDING_LEFT: js.UndefOr[PaddingLeftProperty[String | `0`]] = js.undefined
}
object InspectorThemeDefinition {
  
  inline def apply(
    ARROW_ANIMATION_DURATION: String,
    OBJECT_PREVIEW_ARRAY_MAX_PROPERTIES: Double,
    OBJECT_PREVIEW_OBJECT_MAX_PROPERTIES: Double
  ): InspectorThemeDefinition = {
    val __obj = js.Dynamic.literal(ARROW_ANIMATION_DURATION = ARROW_ANIMATION_DURATION.asInstanceOf[js.Any], OBJECT_PREVIEW_ARRAY_MAX_PROPERTIES = OBJECT_PREVIEW_ARRAY_MAX_PROPERTIES.asInstanceOf[js.Any], OBJECT_PREVIEW_OBJECT_MAX_PROPERTIES = OBJECT_PREVIEW_OBJECT_MAX_PROPERTIES.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectorThemeDefinition]
  }
  
  extension [Self <: InspectorThemeDefinition](x: Self) {
    
    inline def setARROW_ANIMATION_DURATION(value: String): Self = StObject.set(x, "ARROW_ANIMATION_DURATION", value.asInstanceOf[js.Any])
    
    inline def setARROW_COLOR(value: ColorProperty): Self = StObject.set(x, "ARROW_COLOR", value.asInstanceOf[js.Any])
    
    inline def setARROW_COLORUndefined: Self = StObject.set(x, "ARROW_COLOR", js.undefined)
    
    inline def setARROW_FONT_SIZE(value: FontSizeProperty[String | `0`]): Self = StObject.set(x, "ARROW_FONT_SIZE", value.asInstanceOf[js.Any])
    
    inline def setARROW_FONT_SIZEUndefined: Self = StObject.set(x, "ARROW_FONT_SIZE", js.undefined)
    
    inline def setARROW_MARGIN_RIGHT(value: MarginRightProperty[String | `0`]): Self = StObject.set(x, "ARROW_MARGIN_RIGHT", value.asInstanceOf[js.Any])
    
    inline def setARROW_MARGIN_RIGHTUndefined: Self = StObject.set(x, "ARROW_MARGIN_RIGHT", js.undefined)
    
    inline def setBASE_BACKGROUND_COLOR(value: BackgroundColorProperty): Self = StObject.set(x, "BASE_BACKGROUND_COLOR", value.asInstanceOf[js.Any])
    
    inline def setBASE_BACKGROUND_COLORUndefined: Self = StObject.set(x, "BASE_BACKGROUND_COLOR", js.undefined)
    
    inline def setBASE_COLOR(value: ColorProperty): Self = StObject.set(x, "BASE_COLOR", value.asInstanceOf[js.Any])
    
    inline def setBASE_COLORUndefined: Self = StObject.set(x, "BASE_COLOR", js.undefined)
    
    inline def setBASE_FONT_FAMILY(value: FontFamilyProperty): Self = StObject.set(x, "BASE_FONT_FAMILY", value.asInstanceOf[js.Any])
    
    inline def setBASE_FONT_FAMILYUndefined: Self = StObject.set(x, "BASE_FONT_FAMILY", js.undefined)
    
    inline def setBASE_FONT_SIZE(value: FontSizeProperty[String | `0`]): Self = StObject.set(x, "BASE_FONT_SIZE", value.asInstanceOf[js.Any])
    
    inline def setBASE_FONT_SIZEUndefined: Self = StObject.set(x, "BASE_FONT_SIZE", js.undefined)
    
    inline def setBASE_LINE_HEIGHT(value: LineHeightProperty[String | `0`]): Self = StObject.set(x, "BASE_LINE_HEIGHT", value.asInstanceOf[js.Any])
    
    inline def setBASE_LINE_HEIGHTUndefined: Self = StObject.set(x, "BASE_LINE_HEIGHT", js.undefined)
    
    inline def setHTML_ATTRIBUTE_NAME_COLOR(value: ColorProperty): Self = StObject.set(x, "HTML_ATTRIBUTE_NAME_COLOR", value.asInstanceOf[js.Any])
    
    inline def setHTML_ATTRIBUTE_NAME_COLORUndefined: Self = StObject.set(x, "HTML_ATTRIBUTE_NAME_COLOR", js.undefined)
    
    inline def setHTML_ATTRIBUTE_VALUE_COLOR(value: ColorProperty): Self = StObject.set(x, "HTML_ATTRIBUTE_VALUE_COLOR", value.asInstanceOf[js.Any])
    
    inline def setHTML_ATTRIBUTE_VALUE_COLORUndefined: Self = StObject.set(x, "HTML_ATTRIBUTE_VALUE_COLOR", js.undefined)
    
    inline def setHTML_COMMENT_COLOR(value: ColorProperty): Self = StObject.set(x, "HTML_COMMENT_COLOR", value.asInstanceOf[js.Any])
    
    inline def setHTML_COMMENT_COLORUndefined: Self = StObject.set(x, "HTML_COMMENT_COLOR", js.undefined)
    
    inline def setHTML_DOCTYPE_COLOR(value: ColorProperty): Self = StObject.set(x, "HTML_DOCTYPE_COLOR", value.asInstanceOf[js.Any])
    
    inline def setHTML_DOCTYPE_COLORUndefined: Self = StObject.set(x, "HTML_DOCTYPE_COLOR", js.undefined)
    
    inline def setHTML_TAGNAME_COLOR(value: ColorProperty): Self = StObject.set(x, "HTML_TAGNAME_COLOR", value.asInstanceOf[js.Any])
    
    inline def setHTML_TAGNAME_COLORUndefined: Self = StObject.set(x, "HTML_TAGNAME_COLOR", js.undefined)
    
    inline def setHTML_TAGNAME_TEXT_TRANSFORM(value: TextTransformProperty): Self = StObject.set(x, "HTML_TAGNAME_TEXT_TRANSFORM", value.asInstanceOf[js.Any])
    
    inline def setHTML_TAGNAME_TEXT_TRANSFORMUndefined: Self = StObject.set(x, "HTML_TAGNAME_TEXT_TRANSFORM", js.undefined)
    
    inline def setHTML_TAG_COLOR(value: ColorProperty): Self = StObject.set(x, "HTML_TAG_COLOR", value.asInstanceOf[js.Any])
    
    inline def setHTML_TAG_COLORUndefined: Self = StObject.set(x, "HTML_TAG_COLOR", js.undefined)
    
    inline def setOBJECT_NAME_COLOR(value: ColorProperty): Self = StObject.set(x, "OBJECT_NAME_COLOR", value.asInstanceOf[js.Any])
    
    inline def setOBJECT_NAME_COLORUndefined: Self = StObject.set(x, "OBJECT_NAME_COLOR", js.undefined)
    
    inline def setOBJECT_PREVIEW_ARRAY_MAX_PROPERTIES(value: Double): Self = StObject.set(x, "OBJECT_PREVIEW_ARRAY_MAX_PROPERTIES", value.asInstanceOf[js.Any])
    
    inline def setOBJECT_PREVIEW_OBJECT_MAX_PROPERTIES(value: Double): Self = StObject.set(x, "OBJECT_PREVIEW_OBJECT_MAX_PROPERTIES", value.asInstanceOf[js.Any])
    
    inline def setOBJECT_VALUE_BOOLEAN_COLOR(value: ColorProperty): Self = StObject.set(x, "OBJECT_VALUE_BOOLEAN_COLOR", value.asInstanceOf[js.Any])
    
    inline def setOBJECT_VALUE_BOOLEAN_COLORUndefined: Self = StObject.set(x, "OBJECT_VALUE_BOOLEAN_COLOR", js.undefined)
    
    inline def setOBJECT_VALUE_FUNCTION_PREFIX_COLOR(value: ColorProperty): Self = StObject.set(x, "OBJECT_VALUE_FUNCTION_PREFIX_COLOR", value.asInstanceOf[js.Any])
    
    inline def setOBJECT_VALUE_FUNCTION_PREFIX_COLORUndefined: Self = StObject.set(x, "OBJECT_VALUE_FUNCTION_PREFIX_COLOR", js.undefined)
    
    inline def setOBJECT_VALUE_NULL_COLOR(value: ColorProperty): Self = StObject.set(x, "OBJECT_VALUE_NULL_COLOR", value.asInstanceOf[js.Any])
    
    inline def setOBJECT_VALUE_NULL_COLORUndefined: Self = StObject.set(x, "OBJECT_VALUE_NULL_COLOR", js.undefined)
    
    inline def setOBJECT_VALUE_NUMBER_COLOR(value: ColorProperty): Self = StObject.set(x, "OBJECT_VALUE_NUMBER_COLOR", value.asInstanceOf[js.Any])
    
    inline def setOBJECT_VALUE_NUMBER_COLORUndefined: Self = StObject.set(x, "OBJECT_VALUE_NUMBER_COLOR", js.undefined)
    
    inline def setOBJECT_VALUE_REGEXP_COLOR(value: ColorProperty): Self = StObject.set(x, "OBJECT_VALUE_REGEXP_COLOR", value.asInstanceOf[js.Any])
    
    inline def setOBJECT_VALUE_REGEXP_COLORUndefined: Self = StObject.set(x, "OBJECT_VALUE_REGEXP_COLOR", js.undefined)
    
    inline def setOBJECT_VALUE_STRING_COLOR(value: ColorProperty): Self = StObject.set(x, "OBJECT_VALUE_STRING_COLOR", value.asInstanceOf[js.Any])
    
    inline def setOBJECT_VALUE_STRING_COLORUndefined: Self = StObject.set(x, "OBJECT_VALUE_STRING_COLOR", js.undefined)
    
    inline def setOBJECT_VALUE_SYMBOL_COLOR(value: ColorProperty): Self = StObject.set(x, "OBJECT_VALUE_SYMBOL_COLOR", value.asInstanceOf[js.Any])
    
    inline def setOBJECT_VALUE_SYMBOL_COLORUndefined: Self = StObject.set(x, "OBJECT_VALUE_SYMBOL_COLOR", js.undefined)
    
    inline def setOBJECT_VALUE_UNDEFINED_COLOR(value: ColorProperty): Self = StObject.set(x, "OBJECT_VALUE_UNDEFINED_COLOR", value.asInstanceOf[js.Any])
    
    inline def setOBJECT_VALUE_UNDEFINED_COLORUndefined: Self = StObject.set(x, "OBJECT_VALUE_UNDEFINED_COLOR", js.undefined)
    
    inline def setTABLE_BORDER_COLOR(value: BorderColorProperty): Self = StObject.set(x, "TABLE_BORDER_COLOR", value.asInstanceOf[js.Any])
    
    inline def setTABLE_BORDER_COLORUndefined: Self = StObject.set(x, "TABLE_BORDER_COLOR", js.undefined)
    
    inline def setTABLE_DATA_BACKGROUND_IMAGE(value: BackgroundImageProperty): Self = StObject.set(x, "TABLE_DATA_BACKGROUND_IMAGE", value.asInstanceOf[js.Any])
    
    inline def setTABLE_DATA_BACKGROUND_IMAGEUndefined: Self = StObject.set(x, "TABLE_DATA_BACKGROUND_IMAGE", js.undefined)
    
    inline def setTABLE_DATA_BACKGROUND_SIZE(value: BackgroundSizeProperty[String | `0`]): Self = StObject.set(x, "TABLE_DATA_BACKGROUND_SIZE", value.asInstanceOf[js.Any])
    
    inline def setTABLE_DATA_BACKGROUND_SIZEUndefined: Self = StObject.set(x, "TABLE_DATA_BACKGROUND_SIZE", js.undefined)
    
    inline def setTABLE_SORT_ICON_COLOR(value: ColorProperty): Self = StObject.set(x, "TABLE_SORT_ICON_COLOR", value.asInstanceOf[js.Any])
    
    inline def setTABLE_SORT_ICON_COLORUndefined: Self = StObject.set(x, "TABLE_SORT_ICON_COLOR", js.undefined)
    
    inline def setTABLE_TH_BACKGROUND_COLOR(value: BackgroundColorProperty): Self = StObject.set(x, "TABLE_TH_BACKGROUND_COLOR", value.asInstanceOf[js.Any])
    
    inline def setTABLE_TH_BACKGROUND_COLORUndefined: Self = StObject.set(x, "TABLE_TH_BACKGROUND_COLOR", js.undefined)
    
    inline def setTABLE_TH_HOVER_COLOR(value: ColorProperty): Self = StObject.set(x, "TABLE_TH_HOVER_COLOR", value.asInstanceOf[js.Any])
    
    inline def setTABLE_TH_HOVER_COLORUndefined: Self = StObject.set(x, "TABLE_TH_HOVER_COLOR", js.undefined)
    
    inline def setTREENODE_FONT_FAMILY(value: FontFamilyProperty): Self = StObject.set(x, "TREENODE_FONT_FAMILY", value.asInstanceOf[js.Any])
    
    inline def setTREENODE_FONT_FAMILYUndefined: Self = StObject.set(x, "TREENODE_FONT_FAMILY", js.undefined)
    
    inline def setTREENODE_FONT_SIZE(value: FontSizeProperty[String | `0`]): Self = StObject.set(x, "TREENODE_FONT_SIZE", value.asInstanceOf[js.Any])
    
    inline def setTREENODE_FONT_SIZEUndefined: Self = StObject.set(x, "TREENODE_FONT_SIZE", js.undefined)
    
    inline def setTREENODE_LINE_HEIGHT(value: LineHeightProperty[String | `0`]): Self = StObject.set(x, "TREENODE_LINE_HEIGHT", value.asInstanceOf[js.Any])
    
    inline def setTREENODE_LINE_HEIGHTUndefined: Self = StObject.set(x, "TREENODE_LINE_HEIGHT", js.undefined)
    
    inline def setTREENODE_PADDING_LEFT(value: PaddingLeftProperty[String | `0`]): Self = StObject.set(x, "TREENODE_PADDING_LEFT", value.asInstanceOf[js.Any])
    
    inline def setTREENODE_PADDING_LEFTUndefined: Self = StObject.set(x, "TREENODE_PADDING_LEFT", js.undefined)
  }
}
