package typings.reactSketchapp.anon

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.reactSketchapp.reactSketchappStrings.`column-reverse`
import typings.reactSketchapp.reactSketchappStrings.`flex-end`
import typings.reactSketchapp.reactSketchappStrings.`flex-start`
import typings.reactSketchapp.reactSketchappStrings.`line-through`
import typings.reactSketchapp.reactSketchappStrings.`row-reverse`
import typings.reactSketchapp.reactSketchappStrings.`space-around`
import typings.reactSketchapp.reactSketchappStrings.`space-between`
import typings.reactSketchapp.reactSketchappStrings.`wrap-reverse`
import typings.reactSketchapp.reactSketchappStrings.absolute
import typings.reactSketchapp.reactSketchappStrings.auto
import typings.reactSketchapp.reactSketchappStrings.baseline
import typings.reactSketchapp.reactSketchappStrings.center
import typings.reactSketchapp.reactSketchappStrings.column
import typings.reactSketchapp.reactSketchappStrings.dashed
import typings.reactSketchapp.reactSketchappStrings.dotted
import typings.reactSketchapp.reactSketchappStrings.double
import typings.reactSketchapp.reactSketchappStrings.hidden
import typings.reactSketchapp.reactSketchappStrings.italic
import typings.reactSketchapp.reactSketchappStrings.justify
import typings.reactSketchapp.reactSketchappStrings.left
import typings.reactSketchapp.reactSketchappStrings.lowercase
import typings.reactSketchapp.reactSketchappStrings.none
import typings.reactSketchapp.reactSketchappStrings.normal
import typings.reactSketchapp.reactSketchappStrings.nowrap
import typings.reactSketchapp.reactSketchappStrings.relative
import typings.reactSketchapp.reactSketchappStrings.right
import typings.reactSketchapp.reactSketchappStrings.row
import typings.reactSketchapp.reactSketchappStrings.scroll
import typings.reactSketchapp.reactSketchappStrings.solid
import typings.reactSketchapp.reactSketchappStrings.stretch
import typings.reactSketchapp.reactSketchappStrings.underline
import typings.reactSketchapp.reactSketchappStrings.uppercase
import typings.reactSketchapp.reactSketchappStrings.visible
import typings.reactSketchapp.reactSketchappStrings.wrap
import typings.std.NotificationDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignSelf extends StObject {
  
  var alignContent: Requireable[
    auto | center | `space-around` | `space-between` | stretch | `flex-end` | `flex-start` | baseline
  ]
  
  var alignItems: Requireable[center | stretch | `flex-end` | `flex-start` | baseline]
  
  var alignSelf: Requireable[auto | center | stretch | `flex-end` | `flex-start` | baseline]
  
  var aspectRatio: Requireable[Double]
  
  var backfaceVisibility: Requireable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VisibilityState */ Any
  ]
  
  var backgroundColor: Requireable[String | Double]
  
  var borderBottomColor: Requireable[String | Double]
  
  var borderBottomLeftRadius: Requireable[Double]
  
  var borderBottomRightRadius: Requireable[Double]
  
  var borderBottomStyle: Requireable[dashed | dotted | solid]
  
  var borderBottomWidth: Requireable[Double]
  
  var borderColor: Requireable[String | Double]
  
  var borderLeftColor: Requireable[String | Double]
  
  var borderLeftStyle: Requireable[dashed | dotted | solid]
  
  var borderLeftWidth: Requireable[Double]
  
  var borderRadius: Requireable[Double]
  
  var borderRightColor: Requireable[String | Double]
  
  var borderRightStyle: Requireable[dashed | dotted | solid]
  
  var borderRightWidth: Requireable[Double]
  
  var borderStyle: Requireable[dashed | dotted | solid]
  
  var borderTopColor: Requireable[String | Double]
  
  var borderTopLeftRadius: Requireable[Double]
  
  var borderTopRightRadius: Requireable[Double]
  
  var borderTopStyle: Requireable[dashed | dotted | solid]
  
  var borderTopWidth: Requireable[Double]
  
  var borderWidth: Requireable[Double]
  
  var bottom: Requireable[Double]
  
  var color: Requireable[String | Double]
  
  var display: Requireable[String]
  
  var flex: Requireable[Double]
  
  var flexBasis: Requireable[Double]
  
  var flexDirection: Requireable[column | `column-reverse` | row | `row-reverse`]
  
  var flexGrow: Requireable[Double]
  
  var flexShrink: Requireable[Double]
  
  var flexWrap: Requireable[nowrap | wrap | `wrap-reverse`]
  
  var fontFamily: Requireable[String]
  
  var fontSize: Requireable[Double]
  
  var fontStyle: Requireable[normal | italic]
  
  var fontWeight: Requireable[String | Double]
  
  var height: Requireable[Double]
  
  var justifyContent: Requireable[center | `space-around` | `space-between` | `flex-end` | `flex-start`]
  
  var left: Requireable[Double]
  
  var letterSpacing: Requireable[Double]
  
  var lineHeight: Requireable[Double]
  
  var margin: Requireable[Double]
  
  var marginBottom: Requireable[Double]
  
  var marginHorizontal: Requireable[Double]
  
  var marginLeft: Requireable[Double]
  
  var marginRight: Requireable[Double]
  
  var marginTop: Requireable[Double]
  
  var marginVertical: Requireable[Double]
  
  var maxHeight: Requireable[Double]
  
  var maxWidth: Requireable[Double]
  
  var minHeight: Requireable[Double]
  
  var minWidth: Requireable[Double]
  
  var opacity: Requireable[Double]
  
  var overflow: Requireable[hidden | visible | scroll]
  
  var overflowX: Requireable[hidden | visible | scroll]
  
  var overflowY: Requireable[hidden | visible | scroll]
  
  var padding: Requireable[Double]
  
  var paddingBottom: Requireable[Double]
  
  var paddingHorizontal: Requireable[Double]
  
  var paddingLeft: Requireable[Double]
  
  var paddingRight: Requireable[Double]
  
  var paddingTop: Requireable[Double]
  
  var paddingVertical: Requireable[Double]
  
  var paragraphSpacing: Requireable[Double]
  
  var position: Requireable[absolute | relative]
  
  var right: Requireable[Double]
  
  var shadowColor: Requireable[String | Double]
  
  var shadowInner: Requireable[Boolean]
  
  var shadowOffset: Requireable[InferProps[Height]]
  
  var shadowOpacity: Requireable[Double]
  
  var shadowRadius: Requireable[Double]
  
  var shadowSpread: Requireable[Double]
  
  var textAlign: Requireable[auto | left | right | center | justify]
  
  var textDecoration: Requireable[none | double | `line-through` | underline]
  
  var textShadowColor: Requireable[String | Double]
  
  var textShadowOffset: Requireable[InferProps[Height]]
  
  var textShadowOpacity: Requireable[Double]
  
  var textShadowRadius: Requireable[Double]
  
  var textShadowSpread: Requireable[Double]
  
  var textTransform: Requireable[lowercase | uppercase]
  
  var top: Requireable[Double]
  
  var transform: Requireable[String]
  
  var transformOrigin: Requireable[String]
  
  var width: Requireable[Double]
  
  var writingDirection: Requireable[NotificationDirection]
  
  var zIndex: Requireable[Double]
}
object AlignSelf {
  
  inline def apply(
    alignContent: Requireable[
      auto | center | `space-around` | `space-between` | stretch | `flex-end` | `flex-start` | baseline
    ],
    alignItems: Requireable[center | stretch | `flex-end` | `flex-start` | baseline],
    alignSelf: Requireable[auto | center | stretch | `flex-end` | `flex-start` | baseline],
    aspectRatio: Requireable[Double],
    backfaceVisibility: Requireable[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VisibilityState */ Any
    ],
    backgroundColor: Requireable[String | Double],
    borderBottomColor: Requireable[String | Double],
    borderBottomLeftRadius: Requireable[Double],
    borderBottomRightRadius: Requireable[Double],
    borderBottomStyle: Requireable[dashed | dotted | solid],
    borderBottomWidth: Requireable[Double],
    borderColor: Requireable[String | Double],
    borderLeftColor: Requireable[String | Double],
    borderLeftStyle: Requireable[dashed | dotted | solid],
    borderLeftWidth: Requireable[Double],
    borderRadius: Requireable[Double],
    borderRightColor: Requireable[String | Double],
    borderRightStyle: Requireable[dashed | dotted | solid],
    borderRightWidth: Requireable[Double],
    borderStyle: Requireable[dashed | dotted | solid],
    borderTopColor: Requireable[String | Double],
    borderTopLeftRadius: Requireable[Double],
    borderTopRightRadius: Requireable[Double],
    borderTopStyle: Requireable[dashed | dotted | solid],
    borderTopWidth: Requireable[Double],
    borderWidth: Requireable[Double],
    bottom: Requireable[Double],
    color: Requireable[String | Double],
    display: Requireable[String],
    flex: Requireable[Double],
    flexBasis: Requireable[Double],
    flexDirection: Requireable[column | `column-reverse` | row | `row-reverse`],
    flexGrow: Requireable[Double],
    flexShrink: Requireable[Double],
    flexWrap: Requireable[nowrap | wrap | `wrap-reverse`],
    fontFamily: Requireable[String],
    fontSize: Requireable[Double],
    fontStyle: Requireable[normal | italic],
    fontWeight: Requireable[String | Double],
    height: Requireable[Double],
    justifyContent: Requireable[center | `space-around` | `space-between` | `flex-end` | `flex-start`],
    left: Requireable[Double],
    letterSpacing: Requireable[Double],
    lineHeight: Requireable[Double],
    margin: Requireable[Double],
    marginBottom: Requireable[Double],
    marginHorizontal: Requireable[Double],
    marginLeft: Requireable[Double],
    marginRight: Requireable[Double],
    marginTop: Requireable[Double],
    marginVertical: Requireable[Double],
    maxHeight: Requireable[Double],
    maxWidth: Requireable[Double],
    minHeight: Requireable[Double],
    minWidth: Requireable[Double],
    opacity: Requireable[Double],
    overflow: Requireable[hidden | visible | scroll],
    overflowX: Requireable[hidden | visible | scroll],
    overflowY: Requireable[hidden | visible | scroll],
    padding: Requireable[Double],
    paddingBottom: Requireable[Double],
    paddingHorizontal: Requireable[Double],
    paddingLeft: Requireable[Double],
    paddingRight: Requireable[Double],
    paddingTop: Requireable[Double],
    paddingVertical: Requireable[Double],
    paragraphSpacing: Requireable[Double],
    position: Requireable[absolute | relative],
    right: Requireable[Double],
    shadowColor: Requireable[String | Double],
    shadowInner: Requireable[Boolean],
    shadowOffset: Requireable[InferProps[Height]],
    shadowOpacity: Requireable[Double],
    shadowRadius: Requireable[Double],
    shadowSpread: Requireable[Double],
    textAlign: Requireable[auto | left | right | center | justify],
    textDecoration: Requireable[none | double | `line-through` | underline],
    textShadowColor: Requireable[String | Double],
    textShadowOffset: Requireable[InferProps[Height]],
    textShadowOpacity: Requireable[Double],
    textShadowRadius: Requireable[Double],
    textShadowSpread: Requireable[Double],
    textTransform: Requireable[lowercase | uppercase],
    top: Requireable[Double],
    transform: Requireable[String],
    transformOrigin: Requireable[String],
    width: Requireable[Double],
    writingDirection: Requireable[NotificationDirection],
    zIndex: Requireable[Double]
  ): AlignSelf = {
    val __obj = js.Dynamic.literal(alignContent = alignContent.asInstanceOf[js.Any], alignItems = alignItems.asInstanceOf[js.Any], alignSelf = alignSelf.asInstanceOf[js.Any], aspectRatio = aspectRatio.asInstanceOf[js.Any], backfaceVisibility = backfaceVisibility.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], borderBottomColor = borderBottomColor.asInstanceOf[js.Any], borderBottomLeftRadius = borderBottomLeftRadius.asInstanceOf[js.Any], borderBottomRightRadius = borderBottomRightRadius.asInstanceOf[js.Any], borderBottomStyle = borderBottomStyle.asInstanceOf[js.Any], borderBottomWidth = borderBottomWidth.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderLeftColor = borderLeftColor.asInstanceOf[js.Any], borderLeftStyle = borderLeftStyle.asInstanceOf[js.Any], borderLeftWidth = borderLeftWidth.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], borderRightColor = borderRightColor.asInstanceOf[js.Any], borderRightStyle = borderRightStyle.asInstanceOf[js.Any], borderRightWidth = borderRightWidth.asInstanceOf[js.Any], borderStyle = borderStyle.asInstanceOf[js.Any], borderTopColor = borderTopColor.asInstanceOf[js.Any], borderTopLeftRadius = borderTopLeftRadius.asInstanceOf[js.Any], borderTopRightRadius = borderTopRightRadius.asInstanceOf[js.Any], borderTopStyle = borderTopStyle.asInstanceOf[js.Any], borderTopWidth = borderTopWidth.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], bottom = bottom.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], flex = flex.asInstanceOf[js.Any], flexBasis = flexBasis.asInstanceOf[js.Any], flexDirection = flexDirection.asInstanceOf[js.Any], flexGrow = flexGrow.asInstanceOf[js.Any], flexShrink = flexShrink.asInstanceOf[js.Any], flexWrap = flexWrap.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], justifyContent = justifyContent.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], marginBottom = marginBottom.asInstanceOf[js.Any], marginHorizontal = marginHorizontal.asInstanceOf[js.Any], marginLeft = marginLeft.asInstanceOf[js.Any], marginRight = marginRight.asInstanceOf[js.Any], marginTop = marginTop.asInstanceOf[js.Any], marginVertical = marginVertical.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], overflowX = overflowX.asInstanceOf[js.Any], overflowY = overflowY.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], paddingBottom = paddingBottom.asInstanceOf[js.Any], paddingHorizontal = paddingHorizontal.asInstanceOf[js.Any], paddingLeft = paddingLeft.asInstanceOf[js.Any], paddingRight = paddingRight.asInstanceOf[js.Any], paddingTop = paddingTop.asInstanceOf[js.Any], paddingVertical = paddingVertical.asInstanceOf[js.Any], paragraphSpacing = paragraphSpacing.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], shadowColor = shadowColor.asInstanceOf[js.Any], shadowInner = shadowInner.asInstanceOf[js.Any], shadowOffset = shadowOffset.asInstanceOf[js.Any], shadowOpacity = shadowOpacity.asInstanceOf[js.Any], shadowRadius = shadowRadius.asInstanceOf[js.Any], shadowSpread = shadowSpread.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any], textDecoration = textDecoration.asInstanceOf[js.Any], textShadowColor = textShadowColor.asInstanceOf[js.Any], textShadowOffset = textShadowOffset.asInstanceOf[js.Any], textShadowOpacity = textShadowOpacity.asInstanceOf[js.Any], textShadowRadius = textShadowRadius.asInstanceOf[js.Any], textShadowSpread = textShadowSpread.asInstanceOf[js.Any], textTransform = textTransform.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], transformOrigin = transformOrigin.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], writingDirection = writingDirection.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignSelf]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlignSelf] (val x: Self) extends AnyVal {
    
    inline def setAlignContent(
      value: Requireable[
          auto | center | `space-around` | `space-between` | stretch | `flex-end` | `flex-start` | baseline
        ]
    ): Self = StObject.set(x, "alignContent", value.asInstanceOf[js.Any])
    
    inline def setAlignItems(value: Requireable[center | stretch | `flex-end` | `flex-start` | baseline]): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
    
    inline def setAlignSelf(value: Requireable[auto | center | stretch | `flex-end` | `flex-start` | baseline]): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
    
    inline def setAspectRatio(value: Requireable[Double]): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    inline def setBackfaceVisibility(
      value: Requireable[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VisibilityState */ Any
        ]
    ): Self = StObject.set(x, "backfaceVisibility", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColor(value: Requireable[String | Double]): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBorderBottomColor(value: Requireable[String | Double]): Self = StObject.set(x, "borderBottomColor", value.asInstanceOf[js.Any])
    
    inline def setBorderBottomLeftRadius(value: Requireable[Double]): Self = StObject.set(x, "borderBottomLeftRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderBottomRightRadius(value: Requireable[Double]): Self = StObject.set(x, "borderBottomRightRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderBottomStyle(value: Requireable[dashed | dotted | solid]): Self = StObject.set(x, "borderBottomStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderBottomWidth(value: Requireable[Double]): Self = StObject.set(x, "borderBottomWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderColor(value: Requireable[String | Double]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderLeftColor(value: Requireable[String | Double]): Self = StObject.set(x, "borderLeftColor", value.asInstanceOf[js.Any])
    
    inline def setBorderLeftStyle(value: Requireable[dashed | dotted | solid]): Self = StObject.set(x, "borderLeftStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderLeftWidth(value: Requireable[Double]): Self = StObject.set(x, "borderLeftWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderRadius(value: Requireable[Double]): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderRightColor(value: Requireable[String | Double]): Self = StObject.set(x, "borderRightColor", value.asInstanceOf[js.Any])
    
    inline def setBorderRightStyle(value: Requireable[dashed | dotted | solid]): Self = StObject.set(x, "borderRightStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderRightWidth(value: Requireable[Double]): Self = StObject.set(x, "borderRightWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderStyle(value: Requireable[dashed | dotted | solid]): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderTopColor(value: Requireable[String | Double]): Self = StObject.set(x, "borderTopColor", value.asInstanceOf[js.Any])
    
    inline def setBorderTopLeftRadius(value: Requireable[Double]): Self = StObject.set(x, "borderTopLeftRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderTopRightRadius(value: Requireable[Double]): Self = StObject.set(x, "borderTopRightRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderTopStyle(value: Requireable[dashed | dotted | solid]): Self = StObject.set(x, "borderTopStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderTopWidth(value: Requireable[Double]): Self = StObject.set(x, "borderTopWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidth(value: Requireable[Double]): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBottom(value: Requireable[Double]): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setColor(value: Requireable[String | Double]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setDisplay(value: Requireable[String]): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setFlex(value: Requireable[Double]): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
    
    inline def setFlexBasis(value: Requireable[Double]): Self = StObject.set(x, "flexBasis", value.asInstanceOf[js.Any])
    
    inline def setFlexDirection(value: Requireable[column | `column-reverse` | row | `row-reverse`]): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
    
    inline def setFlexGrow(value: Requireable[Double]): Self = StObject.set(x, "flexGrow", value.asInstanceOf[js.Any])
    
    inline def setFlexShrink(value: Requireable[Double]): Self = StObject.set(x, "flexShrink", value.asInstanceOf[js.Any])
    
    inline def setFlexWrap(value: Requireable[nowrap | wrap | `wrap-reverse`]): Self = StObject.set(x, "flexWrap", value.asInstanceOf[js.Any])
    
    inline def setFontFamily(value: Requireable[String]): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: Requireable[Double]): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontStyle(value: Requireable[normal | italic]): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    inline def setFontWeight(value: Requireable[String | Double]): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Requireable[Double]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setJustifyContent(value: Requireable[center | `space-around` | `space-between` | `flex-end` | `flex-start`]): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Requireable[Double]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacing(value: Requireable[Double]): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: Requireable[Double]): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setMargin(value: Requireable[Double]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginBottom(value: Requireable[Double]): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
    
    inline def setMarginHorizontal(value: Requireable[Double]): Self = StObject.set(x, "marginHorizontal", value.asInstanceOf[js.Any])
    
    inline def setMarginLeft(value: Requireable[Double]): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    inline def setMarginRight(value: Requireable[Double]): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
    
    inline def setMarginTop(value: Requireable[Double]): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    inline def setMarginVertical(value: Requireable[Double]): Self = StObject.set(x, "marginVertical", value.asInstanceOf[js.Any])
    
    inline def setMaxHeight(value: Requireable[Double]): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxWidth(value: Requireable[Double]): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMinHeight(value: Requireable[Double]): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinWidth(value: Requireable[Double]): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Requireable[Double]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOverflow(value: Requireable[hidden | visible | scroll]): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setOverflowX(value: Requireable[hidden | visible | scroll]): Self = StObject.set(x, "overflowX", value.asInstanceOf[js.Any])
    
    inline def setOverflowY(value: Requireable[hidden | visible | scroll]): Self = StObject.set(x, "overflowY", value.asInstanceOf[js.Any])
    
    inline def setPadding(value: Requireable[Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingBottom(value: Requireable[Double]): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
    
    inline def setPaddingHorizontal(value: Requireable[Double]): Self = StObject.set(x, "paddingHorizontal", value.asInstanceOf[js.Any])
    
    inline def setPaddingLeft(value: Requireable[Double]): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
    
    inline def setPaddingRight(value: Requireable[Double]): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
    
    inline def setPaddingTop(value: Requireable[Double]): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
    
    inline def setPaddingVertical(value: Requireable[Double]): Self = StObject.set(x, "paddingVertical", value.asInstanceOf[js.Any])
    
    inline def setParagraphSpacing(value: Requireable[Double]): Self = StObject.set(x, "paragraphSpacing", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Requireable[absolute | relative]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Requireable[Double]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setShadowColor(value: Requireable[String | Double]): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    inline def setShadowInner(value: Requireable[Boolean]): Self = StObject.set(x, "shadowInner", value.asInstanceOf[js.Any])
    
    inline def setShadowOffset(value: Requireable[InferProps[Height]]): Self = StObject.set(x, "shadowOffset", value.asInstanceOf[js.Any])
    
    inline def setShadowOpacity(value: Requireable[Double]): Self = StObject.set(x, "shadowOpacity", value.asInstanceOf[js.Any])
    
    inline def setShadowRadius(value: Requireable[Double]): Self = StObject.set(x, "shadowRadius", value.asInstanceOf[js.Any])
    
    inline def setShadowSpread(value: Requireable[Double]): Self = StObject.set(x, "shadowSpread", value.asInstanceOf[js.Any])
    
    inline def setTextAlign(value: Requireable[auto | left | right | center | justify]): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setTextDecoration(value: Requireable[none | double | `line-through` | underline]): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
    
    inline def setTextShadowColor(value: Requireable[String | Double]): Self = StObject.set(x, "textShadowColor", value.asInstanceOf[js.Any])
    
    inline def setTextShadowOffset(value: Requireable[InferProps[Height]]): Self = StObject.set(x, "textShadowOffset", value.asInstanceOf[js.Any])
    
    inline def setTextShadowOpacity(value: Requireable[Double]): Self = StObject.set(x, "textShadowOpacity", value.asInstanceOf[js.Any])
    
    inline def setTextShadowRadius(value: Requireable[Double]): Self = StObject.set(x, "textShadowRadius", value.asInstanceOf[js.Any])
    
    inline def setTextShadowSpread(value: Requireable[Double]): Self = StObject.set(x, "textShadowSpread", value.asInstanceOf[js.Any])
    
    inline def setTextTransform(value: Requireable[lowercase | uppercase]): Self = StObject.set(x, "textTransform", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Requireable[Double]): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: Requireable[String]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformOrigin(value: Requireable[String]): Self = StObject.set(x, "transformOrigin", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Requireable[Double]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWritingDirection(value: Requireable[NotificationDirection]): Self = StObject.set(x, "writingDirection", value.asInstanceOf[js.Any])
    
    inline def setZIndex(value: Requireable[Double]): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
  }
}
