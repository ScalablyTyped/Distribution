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
import scala.scalajs.js.annotation._

trait InspectorThemeDefinition extends InspectorTheme {
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
  @scala.inline
  def apply(
    ARROW_ANIMATION_DURATION: String,
    OBJECT_PREVIEW_ARRAY_MAX_PROPERTIES: Double,
    OBJECT_PREVIEW_OBJECT_MAX_PROPERTIES: Double,
    ARROW_COLOR: ColorProperty = null,
    ARROW_FONT_SIZE: FontSizeProperty[String | `0`] = null,
    ARROW_MARGIN_RIGHT: MarginRightProperty[String | `0`] = null,
    BASE_BACKGROUND_COLOR: BackgroundColorProperty = null,
    BASE_COLOR: ColorProperty = null,
    BASE_FONT_FAMILY: FontFamilyProperty = null,
    BASE_FONT_SIZE: FontSizeProperty[String | `0`] = null,
    BASE_LINE_HEIGHT: LineHeightProperty[String | `0`] = null,
    HTML_ATTRIBUTE_NAME_COLOR: ColorProperty = null,
    HTML_ATTRIBUTE_VALUE_COLOR: ColorProperty = null,
    HTML_COMMENT_COLOR: ColorProperty = null,
    HTML_DOCTYPE_COLOR: ColorProperty = null,
    HTML_TAGNAME_COLOR: ColorProperty = null,
    HTML_TAGNAME_TEXT_TRANSFORM: TextTransformProperty = null,
    HTML_TAG_COLOR: ColorProperty = null,
    OBJECT_NAME_COLOR: ColorProperty = null,
    OBJECT_VALUE_BOOLEAN_COLOR: ColorProperty = null,
    OBJECT_VALUE_FUNCTION_PREFIX_COLOR: ColorProperty = null,
    OBJECT_VALUE_NULL_COLOR: ColorProperty = null,
    OBJECT_VALUE_NUMBER_COLOR: ColorProperty = null,
    OBJECT_VALUE_REGEXP_COLOR: ColorProperty = null,
    OBJECT_VALUE_STRING_COLOR: ColorProperty = null,
    OBJECT_VALUE_SYMBOL_COLOR: ColorProperty = null,
    OBJECT_VALUE_UNDEFINED_COLOR: ColorProperty = null,
    TABLE_BORDER_COLOR: BorderColorProperty = null,
    TABLE_DATA_BACKGROUND_IMAGE: BackgroundImageProperty = null,
    TABLE_DATA_BACKGROUND_SIZE: BackgroundSizeProperty[String | `0`] = null,
    TABLE_SORT_ICON_COLOR: ColorProperty = null,
    TABLE_TH_BACKGROUND_COLOR: BackgroundColorProperty = null,
    TABLE_TH_HOVER_COLOR: ColorProperty = null,
    TREENODE_FONT_FAMILY: FontFamilyProperty = null,
    TREENODE_FONT_SIZE: FontSizeProperty[String | `0`] = null,
    TREENODE_LINE_HEIGHT: LineHeightProperty[String | `0`] = null,
    TREENODE_PADDING_LEFT: PaddingLeftProperty[String | `0`] = null
  ): InspectorThemeDefinition = {
    val __obj = js.Dynamic.literal(ARROW_ANIMATION_DURATION = ARROW_ANIMATION_DURATION.asInstanceOf[js.Any], OBJECT_PREVIEW_ARRAY_MAX_PROPERTIES = OBJECT_PREVIEW_ARRAY_MAX_PROPERTIES.asInstanceOf[js.Any], OBJECT_PREVIEW_OBJECT_MAX_PROPERTIES = OBJECT_PREVIEW_OBJECT_MAX_PROPERTIES.asInstanceOf[js.Any])
    if (ARROW_COLOR != null) __obj.updateDynamic("ARROW_COLOR")(ARROW_COLOR.asInstanceOf[js.Any])
    if (ARROW_FONT_SIZE != null) __obj.updateDynamic("ARROW_FONT_SIZE")(ARROW_FONT_SIZE.asInstanceOf[js.Any])
    if (ARROW_MARGIN_RIGHT != null) __obj.updateDynamic("ARROW_MARGIN_RIGHT")(ARROW_MARGIN_RIGHT.asInstanceOf[js.Any])
    if (BASE_BACKGROUND_COLOR != null) __obj.updateDynamic("BASE_BACKGROUND_COLOR")(BASE_BACKGROUND_COLOR.asInstanceOf[js.Any])
    if (BASE_COLOR != null) __obj.updateDynamic("BASE_COLOR")(BASE_COLOR.asInstanceOf[js.Any])
    if (BASE_FONT_FAMILY != null) __obj.updateDynamic("BASE_FONT_FAMILY")(BASE_FONT_FAMILY.asInstanceOf[js.Any])
    if (BASE_FONT_SIZE != null) __obj.updateDynamic("BASE_FONT_SIZE")(BASE_FONT_SIZE.asInstanceOf[js.Any])
    if (BASE_LINE_HEIGHT != null) __obj.updateDynamic("BASE_LINE_HEIGHT")(BASE_LINE_HEIGHT.asInstanceOf[js.Any])
    if (HTML_ATTRIBUTE_NAME_COLOR != null) __obj.updateDynamic("HTML_ATTRIBUTE_NAME_COLOR")(HTML_ATTRIBUTE_NAME_COLOR.asInstanceOf[js.Any])
    if (HTML_ATTRIBUTE_VALUE_COLOR != null) __obj.updateDynamic("HTML_ATTRIBUTE_VALUE_COLOR")(HTML_ATTRIBUTE_VALUE_COLOR.asInstanceOf[js.Any])
    if (HTML_COMMENT_COLOR != null) __obj.updateDynamic("HTML_COMMENT_COLOR")(HTML_COMMENT_COLOR.asInstanceOf[js.Any])
    if (HTML_DOCTYPE_COLOR != null) __obj.updateDynamic("HTML_DOCTYPE_COLOR")(HTML_DOCTYPE_COLOR.asInstanceOf[js.Any])
    if (HTML_TAGNAME_COLOR != null) __obj.updateDynamic("HTML_TAGNAME_COLOR")(HTML_TAGNAME_COLOR.asInstanceOf[js.Any])
    if (HTML_TAGNAME_TEXT_TRANSFORM != null) __obj.updateDynamic("HTML_TAGNAME_TEXT_TRANSFORM")(HTML_TAGNAME_TEXT_TRANSFORM.asInstanceOf[js.Any])
    if (HTML_TAG_COLOR != null) __obj.updateDynamic("HTML_TAG_COLOR")(HTML_TAG_COLOR.asInstanceOf[js.Any])
    if (OBJECT_NAME_COLOR != null) __obj.updateDynamic("OBJECT_NAME_COLOR")(OBJECT_NAME_COLOR.asInstanceOf[js.Any])
    if (OBJECT_VALUE_BOOLEAN_COLOR != null) __obj.updateDynamic("OBJECT_VALUE_BOOLEAN_COLOR")(OBJECT_VALUE_BOOLEAN_COLOR.asInstanceOf[js.Any])
    if (OBJECT_VALUE_FUNCTION_PREFIX_COLOR != null) __obj.updateDynamic("OBJECT_VALUE_FUNCTION_PREFIX_COLOR")(OBJECT_VALUE_FUNCTION_PREFIX_COLOR.asInstanceOf[js.Any])
    if (OBJECT_VALUE_NULL_COLOR != null) __obj.updateDynamic("OBJECT_VALUE_NULL_COLOR")(OBJECT_VALUE_NULL_COLOR.asInstanceOf[js.Any])
    if (OBJECT_VALUE_NUMBER_COLOR != null) __obj.updateDynamic("OBJECT_VALUE_NUMBER_COLOR")(OBJECT_VALUE_NUMBER_COLOR.asInstanceOf[js.Any])
    if (OBJECT_VALUE_REGEXP_COLOR != null) __obj.updateDynamic("OBJECT_VALUE_REGEXP_COLOR")(OBJECT_VALUE_REGEXP_COLOR.asInstanceOf[js.Any])
    if (OBJECT_VALUE_STRING_COLOR != null) __obj.updateDynamic("OBJECT_VALUE_STRING_COLOR")(OBJECT_VALUE_STRING_COLOR.asInstanceOf[js.Any])
    if (OBJECT_VALUE_SYMBOL_COLOR != null) __obj.updateDynamic("OBJECT_VALUE_SYMBOL_COLOR")(OBJECT_VALUE_SYMBOL_COLOR.asInstanceOf[js.Any])
    if (OBJECT_VALUE_UNDEFINED_COLOR != null) __obj.updateDynamic("OBJECT_VALUE_UNDEFINED_COLOR")(OBJECT_VALUE_UNDEFINED_COLOR.asInstanceOf[js.Any])
    if (TABLE_BORDER_COLOR != null) __obj.updateDynamic("TABLE_BORDER_COLOR")(TABLE_BORDER_COLOR.asInstanceOf[js.Any])
    if (TABLE_DATA_BACKGROUND_IMAGE != null) __obj.updateDynamic("TABLE_DATA_BACKGROUND_IMAGE")(TABLE_DATA_BACKGROUND_IMAGE.asInstanceOf[js.Any])
    if (TABLE_DATA_BACKGROUND_SIZE != null) __obj.updateDynamic("TABLE_DATA_BACKGROUND_SIZE")(TABLE_DATA_BACKGROUND_SIZE.asInstanceOf[js.Any])
    if (TABLE_SORT_ICON_COLOR != null) __obj.updateDynamic("TABLE_SORT_ICON_COLOR")(TABLE_SORT_ICON_COLOR.asInstanceOf[js.Any])
    if (TABLE_TH_BACKGROUND_COLOR != null) __obj.updateDynamic("TABLE_TH_BACKGROUND_COLOR")(TABLE_TH_BACKGROUND_COLOR.asInstanceOf[js.Any])
    if (TABLE_TH_HOVER_COLOR != null) __obj.updateDynamic("TABLE_TH_HOVER_COLOR")(TABLE_TH_HOVER_COLOR.asInstanceOf[js.Any])
    if (TREENODE_FONT_FAMILY != null) __obj.updateDynamic("TREENODE_FONT_FAMILY")(TREENODE_FONT_FAMILY.asInstanceOf[js.Any])
    if (TREENODE_FONT_SIZE != null) __obj.updateDynamic("TREENODE_FONT_SIZE")(TREENODE_FONT_SIZE.asInstanceOf[js.Any])
    if (TREENODE_LINE_HEIGHT != null) __obj.updateDynamic("TREENODE_LINE_HEIGHT")(TREENODE_LINE_HEIGHT.asInstanceOf[js.Any])
    if (TREENODE_PADDING_LEFT != null) __obj.updateDynamic("TREENODE_PADDING_LEFT")(TREENODE_PADDING_LEFT.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectorThemeDefinition]
  }
}

