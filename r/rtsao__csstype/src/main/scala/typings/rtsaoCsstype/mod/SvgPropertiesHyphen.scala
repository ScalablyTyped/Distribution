package typings.rtsaoCsstype.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SvgPropertiesHyphen[TLength] extends StObject {
  
  var `alignment-baseline`: js.UndefOr[AlignmentBaselineProperty] = js.undefined
  
  var `baseline-shift`: js.UndefOr[BaselineShiftProperty[TLength]] = js.undefined
  
  var clip: js.UndefOr[ClipProperty] = js.undefined
  
  var `clip-path`: js.UndefOr[ClipPathProperty] = js.undefined
  
  var `clip-rule`: js.UndefOr[ClipRuleProperty] = js.undefined
  
  var color: js.UndefOr[ColorProperty] = js.undefined
  
  var `color-interpolation`: js.UndefOr[ColorInterpolationProperty] = js.undefined
  
  var `color-rendering`: js.UndefOr[ColorRenderingProperty] = js.undefined
  
  var cursor: js.UndefOr[CursorProperty] = js.undefined
  
  var direction: js.UndefOr[DirectionProperty] = js.undefined
  
  var display: js.UndefOr[DisplayProperty] = js.undefined
  
  var `dominant-baseline`: js.UndefOr[DominantBaselineProperty] = js.undefined
  
  var fill: js.UndefOr[FillProperty] = js.undefined
  
  var `fill-opacity`: js.UndefOr[GlobalsNumber] = js.undefined
  
  var `fill-rule`: js.UndefOr[FillRuleProperty] = js.undefined
  
  var filter: js.UndefOr[FilterProperty] = js.undefined
  
  var `flood-color`: js.UndefOr[FloodColorProperty] = js.undefined
  
  var `flood-opacity`: js.UndefOr[GlobalsNumber] = js.undefined
  
  var font: js.UndefOr[FontProperty] = js.undefined
  
  var `font-family`: js.UndefOr[FontFamilyProperty] = js.undefined
  
  var `font-size`: js.UndefOr[FontSizeProperty[TLength]] = js.undefined
  
  var `font-size-adjust`: js.UndefOr[FontSizeAdjustProperty] = js.undefined
  
  var `font-stretch`: js.UndefOr[FontStretchProperty] = js.undefined
  
  var `font-style`: js.UndefOr[FontStyleProperty] = js.undefined
  
  var `font-variant`: js.UndefOr[FontVariantProperty] = js.undefined
  
  var `font-weight`: js.UndefOr[FontWeightProperty] = js.undefined
  
  var `glyph-orientation-vertical`: js.UndefOr[GlyphOrientationVerticalProperty] = js.undefined
  
  var `image-rendering`: js.UndefOr[ImageRenderingProperty] = js.undefined
  
  var `letter-spacing`: js.UndefOr[LetterSpacingProperty[TLength]] = js.undefined
  
  var `lighting-color`: js.UndefOr[LightingColorProperty] = js.undefined
  
  var `line-height`: js.UndefOr[LineHeightProperty[TLength]] = js.undefined
  
  var marker: js.UndefOr[MarkerProperty] = js.undefined
  
  var `marker-end`: js.UndefOr[MarkerEndProperty] = js.undefined
  
  var `marker-mid`: js.UndefOr[MarkerMidProperty] = js.undefined
  
  var `marker-start`: js.UndefOr[MarkerStartProperty] = js.undefined
  
  var mask: js.UndefOr[MaskProperty[TLength]] = js.undefined
  
  var opacity: js.UndefOr[GlobalsNumber] = js.undefined
  
  var overflow: js.UndefOr[OverflowProperty] = js.undefined
  
  var `paint-order`: js.UndefOr[PaintOrderProperty] = js.undefined
  
  var `pointer-events`: js.UndefOr[PointerEventsProperty] = js.undefined
  
  var `shape-rendering`: js.UndefOr[ShapeRenderingProperty] = js.undefined
  
  var `stop-color`: js.UndefOr[StopColorProperty] = js.undefined
  
  var `stop-opacity`: js.UndefOr[GlobalsNumber] = js.undefined
  
  var stroke: js.UndefOr[StrokeProperty] = js.undefined
  
  var `stroke-dasharray`: js.UndefOr[StrokeDasharrayProperty[TLength]] = js.undefined
  
  var `stroke-dashoffset`: js.UndefOr[StrokeDashoffsetProperty[TLength]] = js.undefined
  
  var `stroke-linecap`: js.UndefOr[StrokeLinecapProperty] = js.undefined
  
  var `stroke-linejoin`: js.UndefOr[StrokeLinejoinProperty] = js.undefined
  
  var `stroke-miterlimit`: js.UndefOr[GlobalsNumber] = js.undefined
  
  var `stroke-opacity`: js.UndefOr[GlobalsNumber] = js.undefined
  
  var `stroke-width`: js.UndefOr[StrokeWidthProperty[TLength]] = js.undefined
  
  var `text-anchor`: js.UndefOr[TextAnchorProperty] = js.undefined
  
  var `text-decoration`: js.UndefOr[TextDecorationProperty] = js.undefined
  
  var `text-rendering`: js.UndefOr[TextRenderingProperty] = js.undefined
  
  var `unicode-bidi`: js.UndefOr[UnicodeBidiProperty] = js.undefined
  
  var `vector-effect`: js.UndefOr[VectorEffectProperty] = js.undefined
  
  var visibility: js.UndefOr[VisibilityProperty] = js.undefined
  
  var `white-space`: js.UndefOr[WhiteSpaceProperty] = js.undefined
  
  var `word-spacing`: js.UndefOr[WordSpacingProperty[TLength]] = js.undefined
  
  var `writing-mode`: js.UndefOr[WritingModeProperty] = js.undefined
}
object SvgPropertiesHyphen {
  
  inline def apply[TLength](): SvgPropertiesHyphen[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SvgPropertiesHyphen[TLength]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SvgPropertiesHyphen[?], TLength] (val x: Self & SvgPropertiesHyphen[TLength]) extends AnyVal {
    
    inline def `setAlignment-baseline`(value: AlignmentBaselineProperty): Self = StObject.set(x, "alignment-baseline", value.asInstanceOf[js.Any])
    
    inline def `setAlignment-baselineUndefined`: Self = StObject.set(x, "alignment-baseline", js.undefined)
    
    inline def `setBaseline-shift`(value: BaselineShiftProperty[TLength]): Self = StObject.set(x, "baseline-shift", value.asInstanceOf[js.Any])
    
    inline def `setBaseline-shiftUndefined`: Self = StObject.set(x, "baseline-shift", js.undefined)
    
    inline def setClip(value: ClipProperty): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    inline def `setClip-path`(value: ClipPathProperty): Self = StObject.set(x, "clip-path", value.asInstanceOf[js.Any])
    
    inline def `setClip-pathUndefined`: Self = StObject.set(x, "clip-path", js.undefined)
    
    inline def `setClip-rule`(value: ClipRuleProperty): Self = StObject.set(x, "clip-rule", value.asInstanceOf[js.Any])
    
    inline def `setClip-ruleUndefined`: Self = StObject.set(x, "clip-rule", js.undefined)
    
    inline def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
    
    inline def setColor(value: ColorProperty): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def `setColor-interpolation`(value: ColorInterpolationProperty): Self = StObject.set(x, "color-interpolation", value.asInstanceOf[js.Any])
    
    inline def `setColor-interpolationUndefined`: Self = StObject.set(x, "color-interpolation", js.undefined)
    
    inline def `setColor-rendering`(value: ColorRenderingProperty): Self = StObject.set(x, "color-rendering", value.asInstanceOf[js.Any])
    
    inline def `setColor-renderingUndefined`: Self = StObject.set(x, "color-rendering", js.undefined)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCursor(value: CursorProperty): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setDirection(value: DirectionProperty): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setDisplay(value: DisplayProperty): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def `setDominant-baseline`(value: DominantBaselineProperty): Self = StObject.set(x, "dominant-baseline", value.asInstanceOf[js.Any])
    
    inline def `setDominant-baselineUndefined`: Self = StObject.set(x, "dominant-baseline", js.undefined)
    
    inline def setFill(value: FillProperty): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def `setFill-opacity`(value: GlobalsNumber): Self = StObject.set(x, "fill-opacity", value.asInstanceOf[js.Any])
    
    inline def `setFill-opacityUndefined`: Self = StObject.set(x, "fill-opacity", js.undefined)
    
    inline def `setFill-rule`(value: FillRuleProperty): Self = StObject.set(x, "fill-rule", value.asInstanceOf[js.Any])
    
    inline def `setFill-ruleUndefined`: Self = StObject.set(x, "fill-rule", js.undefined)
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setFilter(value: FilterProperty): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def `setFlood-color`(value: FloodColorProperty): Self = StObject.set(x, "flood-color", value.asInstanceOf[js.Any])
    
    inline def `setFlood-colorUndefined`: Self = StObject.set(x, "flood-color", js.undefined)
    
    inline def `setFlood-opacity`(value: GlobalsNumber): Self = StObject.set(x, "flood-opacity", value.asInstanceOf[js.Any])
    
    inline def `setFlood-opacityUndefined`: Self = StObject.set(x, "flood-opacity", js.undefined)
    
    inline def setFont(value: FontProperty): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def `setFont-family`(value: FontFamilyProperty): Self = StObject.set(x, "font-family", value.asInstanceOf[js.Any])
    
    inline def `setFont-familyUndefined`: Self = StObject.set(x, "font-family", js.undefined)
    
    inline def `setFont-size`(value: FontSizeProperty[TLength]): Self = StObject.set(x, "font-size", value.asInstanceOf[js.Any])
    
    inline def `setFont-size-adjust`(value: FontSizeAdjustProperty): Self = StObject.set(x, "font-size-adjust", value.asInstanceOf[js.Any])
    
    inline def `setFont-size-adjustUndefined`: Self = StObject.set(x, "font-size-adjust", js.undefined)
    
    inline def `setFont-sizeUndefined`: Self = StObject.set(x, "font-size", js.undefined)
    
    inline def `setFont-stretch`(value: FontStretchProperty): Self = StObject.set(x, "font-stretch", value.asInstanceOf[js.Any])
    
    inline def `setFont-stretchUndefined`: Self = StObject.set(x, "font-stretch", js.undefined)
    
    inline def `setFont-style`(value: FontStyleProperty): Self = StObject.set(x, "font-style", value.asInstanceOf[js.Any])
    
    inline def `setFont-styleUndefined`: Self = StObject.set(x, "font-style", js.undefined)
    
    inline def `setFont-variant`(value: FontVariantProperty): Self = StObject.set(x, "font-variant", value.asInstanceOf[js.Any])
    
    inline def `setFont-variantUndefined`: Self = StObject.set(x, "font-variant", js.undefined)
    
    inline def `setFont-weight`(value: FontWeightProperty): Self = StObject.set(x, "font-weight", value.asInstanceOf[js.Any])
    
    inline def `setFont-weightUndefined`: Self = StObject.set(x, "font-weight", js.undefined)
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def `setGlyph-orientation-vertical`(value: GlyphOrientationVerticalProperty): Self = StObject.set(x, "glyph-orientation-vertical", value.asInstanceOf[js.Any])
    
    inline def `setGlyph-orientation-verticalUndefined`: Self = StObject.set(x, "glyph-orientation-vertical", js.undefined)
    
    inline def `setImage-rendering`(value: ImageRenderingProperty): Self = StObject.set(x, "image-rendering", value.asInstanceOf[js.Any])
    
    inline def `setImage-renderingUndefined`: Self = StObject.set(x, "image-rendering", js.undefined)
    
    inline def `setLetter-spacing`(value: LetterSpacingProperty[TLength]): Self = StObject.set(x, "letter-spacing", value.asInstanceOf[js.Any])
    
    inline def `setLetter-spacingUndefined`: Self = StObject.set(x, "letter-spacing", js.undefined)
    
    inline def `setLighting-color`(value: LightingColorProperty): Self = StObject.set(x, "lighting-color", value.asInstanceOf[js.Any])
    
    inline def `setLighting-colorUndefined`: Self = StObject.set(x, "lighting-color", js.undefined)
    
    inline def `setLine-height`(value: LineHeightProperty[TLength]): Self = StObject.set(x, "line-height", value.asInstanceOf[js.Any])
    
    inline def `setLine-heightUndefined`: Self = StObject.set(x, "line-height", js.undefined)
    
    inline def setMarker(value: MarkerProperty): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def `setMarker-end`(value: MarkerEndProperty): Self = StObject.set(x, "marker-end", value.asInstanceOf[js.Any])
    
    inline def `setMarker-endUndefined`: Self = StObject.set(x, "marker-end", js.undefined)
    
    inline def `setMarker-mid`(value: MarkerMidProperty): Self = StObject.set(x, "marker-mid", value.asInstanceOf[js.Any])
    
    inline def `setMarker-midUndefined`: Self = StObject.set(x, "marker-mid", js.undefined)
    
    inline def `setMarker-start`(value: MarkerStartProperty): Self = StObject.set(x, "marker-start", value.asInstanceOf[js.Any])
    
    inline def `setMarker-startUndefined`: Self = StObject.set(x, "marker-start", js.undefined)
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def setMask(value: MaskProperty[TLength]): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    inline def setOpacity(value: GlobalsNumber): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setOverflow(value: OverflowProperty): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
    
    inline def `setPaint-order`(value: PaintOrderProperty): Self = StObject.set(x, "paint-order", value.asInstanceOf[js.Any])
    
    inline def `setPaint-orderUndefined`: Self = StObject.set(x, "paint-order", js.undefined)
    
    inline def `setPointer-events`(value: PointerEventsProperty): Self = StObject.set(x, "pointer-events", value.asInstanceOf[js.Any])
    
    inline def `setPointer-eventsUndefined`: Self = StObject.set(x, "pointer-events", js.undefined)
    
    inline def `setShape-rendering`(value: ShapeRenderingProperty): Self = StObject.set(x, "shape-rendering", value.asInstanceOf[js.Any])
    
    inline def `setShape-renderingUndefined`: Self = StObject.set(x, "shape-rendering", js.undefined)
    
    inline def `setStop-color`(value: StopColorProperty): Self = StObject.set(x, "stop-color", value.asInstanceOf[js.Any])
    
    inline def `setStop-colorUndefined`: Self = StObject.set(x, "stop-color", js.undefined)
    
    inline def `setStop-opacity`(value: GlobalsNumber): Self = StObject.set(x, "stop-opacity", value.asInstanceOf[js.Any])
    
    inline def `setStop-opacityUndefined`: Self = StObject.set(x, "stop-opacity", js.undefined)
    
    inline def setStroke(value: StrokeProperty): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def `setStroke-dasharray`(value: StrokeDasharrayProperty[TLength]): Self = StObject.set(x, "stroke-dasharray", value.asInstanceOf[js.Any])
    
    inline def `setStroke-dasharrayUndefined`: Self = StObject.set(x, "stroke-dasharray", js.undefined)
    
    inline def `setStroke-dashoffset`(value: StrokeDashoffsetProperty[TLength]): Self = StObject.set(x, "stroke-dashoffset", value.asInstanceOf[js.Any])
    
    inline def `setStroke-dashoffsetUndefined`: Self = StObject.set(x, "stroke-dashoffset", js.undefined)
    
    inline def `setStroke-linecap`(value: StrokeLinecapProperty): Self = StObject.set(x, "stroke-linecap", value.asInstanceOf[js.Any])
    
    inline def `setStroke-linecapUndefined`: Self = StObject.set(x, "stroke-linecap", js.undefined)
    
    inline def `setStroke-linejoin`(value: StrokeLinejoinProperty): Self = StObject.set(x, "stroke-linejoin", value.asInstanceOf[js.Any])
    
    inline def `setStroke-linejoinUndefined`: Self = StObject.set(x, "stroke-linejoin", js.undefined)
    
    inline def `setStroke-miterlimit`(value: GlobalsNumber): Self = StObject.set(x, "stroke-miterlimit", value.asInstanceOf[js.Any])
    
    inline def `setStroke-miterlimitUndefined`: Self = StObject.set(x, "stroke-miterlimit", js.undefined)
    
    inline def `setStroke-opacity`(value: GlobalsNumber): Self = StObject.set(x, "stroke-opacity", value.asInstanceOf[js.Any])
    
    inline def `setStroke-opacityUndefined`: Self = StObject.set(x, "stroke-opacity", js.undefined)
    
    inline def `setStroke-width`(value: StrokeWidthProperty[TLength]): Self = StObject.set(x, "stroke-width", value.asInstanceOf[js.Any])
    
    inline def `setStroke-widthUndefined`: Self = StObject.set(x, "stroke-width", js.undefined)
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def `setText-anchor`(value: TextAnchorProperty): Self = StObject.set(x, "text-anchor", value.asInstanceOf[js.Any])
    
    inline def `setText-anchorUndefined`: Self = StObject.set(x, "text-anchor", js.undefined)
    
    inline def `setText-decoration`(value: TextDecorationProperty): Self = StObject.set(x, "text-decoration", value.asInstanceOf[js.Any])
    
    inline def `setText-decorationUndefined`: Self = StObject.set(x, "text-decoration", js.undefined)
    
    inline def `setText-rendering`(value: TextRenderingProperty): Self = StObject.set(x, "text-rendering", value.asInstanceOf[js.Any])
    
    inline def `setText-renderingUndefined`: Self = StObject.set(x, "text-rendering", js.undefined)
    
    inline def `setUnicode-bidi`(value: UnicodeBidiProperty): Self = StObject.set(x, "unicode-bidi", value.asInstanceOf[js.Any])
    
    inline def `setUnicode-bidiUndefined`: Self = StObject.set(x, "unicode-bidi", js.undefined)
    
    inline def `setVector-effect`(value: VectorEffectProperty): Self = StObject.set(x, "vector-effect", value.asInstanceOf[js.Any])
    
    inline def `setVector-effectUndefined`: Self = StObject.set(x, "vector-effect", js.undefined)
    
    inline def setVisibility(value: VisibilityProperty): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
    
    inline def `setWhite-space`(value: WhiteSpaceProperty): Self = StObject.set(x, "white-space", value.asInstanceOf[js.Any])
    
    inline def `setWhite-spaceUndefined`: Self = StObject.set(x, "white-space", js.undefined)
    
    inline def `setWord-spacing`(value: WordSpacingProperty[TLength]): Self = StObject.set(x, "word-spacing", value.asInstanceOf[js.Any])
    
    inline def `setWord-spacingUndefined`: Self = StObject.set(x, "word-spacing", js.undefined)
    
    inline def `setWriting-mode`(value: WritingModeProperty): Self = StObject.set(x, "writing-mode", value.asInstanceOf[js.Any])
    
    inline def `setWriting-modeUndefined`: Self = StObject.set(x, "writing-mode", js.undefined)
  }
}
