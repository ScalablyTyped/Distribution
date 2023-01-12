package typings.rtsaoCsstype.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.rtsaoCsstype.mod.SvgPropertiesHyphenFallback because var conflicts: clip, `clip-path`, color, cursor, direction, display, filter, font, `font-family`, `font-size`, `font-size-adjust`, `font-stretch`, `font-style`, `font-variant`, `font-weight`, `image-rendering`, `letter-spacing`, `line-height`, mask, opacity, overflow, `paint-order`, `pointer-events`, `text-decoration`, `text-rendering`, `unicode-bidi`, visibility, `white-space`, `word-spacing`, `writing-mode`. Inlined `alignment-baseline`, `baseline-shift`, `clip-rule`, `color-interpolation`, `color-rendering`, `dominant-baseline`, fill, `fill-opacity`, `fill-rule`, `flood-color`, `flood-opacity`, `glyph-orientation-vertical`, `lighting-color`, marker, `marker-end`, `marker-mid`, `marker-start`, `shape-rendering`, `stop-color`, `stop-opacity`, stroke, `stroke-dasharray`, `stroke-dashoffset`, `stroke-linecap`, `stroke-linejoin`, `stroke-miterlimit`, `stroke-opacity`, `stroke-width`, `text-anchor`, `vector-effect` */ trait PropertiesHyphenFallback[TLength]
  extends StObject
     with StandardPropertiesHyphenFallback[TLength]
     with VendorPropertiesHyphenFallback[TLength]
     with ObsoletePropertiesHyphenFallback[TLength] {
  
  var `alignment-baseline`: js.UndefOr[AlignmentBaselineProperty | js.Array[AlignmentBaselineProperty]] = js.undefined
  
  var `baseline-shift`: js.UndefOr[BaselineShiftProperty[TLength] | js.Array[BaselineShiftProperty[TLength]]] = js.undefined
  
  var `clip-rule`: js.UndefOr[ClipRuleProperty | js.Array[ClipRuleProperty]] = js.undefined
  
  var `color-interpolation`: js.UndefOr[ColorInterpolationProperty | js.Array[ColorInterpolationProperty]] = js.undefined
  
  var `color-rendering`: js.UndefOr[ColorRenderingProperty | js.Array[ColorRenderingProperty]] = js.undefined
  
  var `dominant-baseline`: js.UndefOr[DominantBaselineProperty | js.Array[DominantBaselineProperty]] = js.undefined
  
  var fill: js.UndefOr[FillProperty | js.Array[FillProperty]] = js.undefined
  
  var `fill-opacity`: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.undefined
  
  var `fill-rule`: js.UndefOr[FillRuleProperty | js.Array[FillRuleProperty]] = js.undefined
  
  var `flood-color`: js.UndefOr[FloodColorProperty | js.Array[FloodColorProperty]] = js.undefined
  
  var `flood-opacity`: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.undefined
  
  var `glyph-orientation-vertical`: js.UndefOr[GlyphOrientationVerticalProperty | js.Array[GlyphOrientationVerticalProperty]] = js.undefined
  
  var `lighting-color`: js.UndefOr[LightingColorProperty | js.Array[LightingColorProperty]] = js.undefined
  
  var marker: js.UndefOr[MarkerProperty | js.Array[MarkerProperty]] = js.undefined
  
  var `marker-end`: js.UndefOr[MarkerEndProperty | js.Array[MarkerEndProperty]] = js.undefined
  
  var `marker-mid`: js.UndefOr[MarkerMidProperty | js.Array[MarkerMidProperty]] = js.undefined
  
  var `marker-start`: js.UndefOr[MarkerStartProperty | js.Array[MarkerStartProperty]] = js.undefined
  
  var `shape-rendering`: js.UndefOr[ShapeRenderingProperty | js.Array[ShapeRenderingProperty]] = js.undefined
  
  var `stop-color`: js.UndefOr[StopColorProperty | js.Array[StopColorProperty]] = js.undefined
  
  var `stop-opacity`: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.undefined
  
  var stroke: js.UndefOr[StrokeProperty | js.Array[StrokeProperty]] = js.undefined
  
  var `stroke-dasharray`: js.UndefOr[StrokeDasharrayProperty[TLength] | js.Array[StrokeDasharrayProperty[TLength]]] = js.undefined
  
  var `stroke-dashoffset`: js.UndefOr[StrokeDashoffsetProperty[TLength] | js.Array[StrokeDashoffsetProperty[TLength]]] = js.undefined
  
  var `stroke-linecap`: js.UndefOr[StrokeLinecapProperty | js.Array[StrokeLinecapProperty]] = js.undefined
  
  var `stroke-linejoin`: js.UndefOr[StrokeLinejoinProperty | js.Array[StrokeLinejoinProperty]] = js.undefined
  
  var `stroke-miterlimit`: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.undefined
  
  var `stroke-opacity`: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.undefined
  
  var `stroke-width`: js.UndefOr[StrokeWidthProperty[TLength] | js.Array[StrokeWidthProperty[TLength]]] = js.undefined
  
  var `text-anchor`: js.UndefOr[TextAnchorProperty | js.Array[TextAnchorProperty]] = js.undefined
  
  var `vector-effect`: js.UndefOr[VectorEffectProperty | js.Array[VectorEffectProperty]] = js.undefined
}
object PropertiesHyphenFallback {
  
  inline def apply[TLength](): PropertiesHyphenFallback[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertiesHyphenFallback[TLength]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertiesHyphenFallback[?], TLength] (val x: Self & PropertiesHyphenFallback[TLength]) extends AnyVal {
    
    inline def `setAlignment-baseline`(value: AlignmentBaselineProperty | js.Array[AlignmentBaselineProperty]): Self = StObject.set(x, "alignment-baseline", value.asInstanceOf[js.Any])
    
    inline def `setAlignment-baselineUndefined`: Self = StObject.set(x, "alignment-baseline", js.undefined)
    
    inline def `setAlignment-baselineVarargs`(value: AlignmentBaselineProperty*): Self = StObject.set(x, "alignment-baseline", js.Array(value*))
    
    inline def `setBaseline-shift`(value: BaselineShiftProperty[TLength] | js.Array[BaselineShiftProperty[TLength]]): Self = StObject.set(x, "baseline-shift", value.asInstanceOf[js.Any])
    
    inline def `setBaseline-shiftUndefined`: Self = StObject.set(x, "baseline-shift", js.undefined)
    
    inline def `setBaseline-shiftVarargs`(value: BaselineShiftProperty[TLength]*): Self = StObject.set(x, "baseline-shift", js.Array(value*))
    
    inline def `setClip-rule`(value: ClipRuleProperty | js.Array[ClipRuleProperty]): Self = StObject.set(x, "clip-rule", value.asInstanceOf[js.Any])
    
    inline def `setClip-ruleUndefined`: Self = StObject.set(x, "clip-rule", js.undefined)
    
    inline def `setClip-ruleVarargs`(value: ClipRuleProperty*): Self = StObject.set(x, "clip-rule", js.Array(value*))
    
    inline def `setColor-interpolation`(value: ColorInterpolationProperty | js.Array[ColorInterpolationProperty]): Self = StObject.set(x, "color-interpolation", value.asInstanceOf[js.Any])
    
    inline def `setColor-interpolationUndefined`: Self = StObject.set(x, "color-interpolation", js.undefined)
    
    inline def `setColor-interpolationVarargs`(value: ColorInterpolationProperty*): Self = StObject.set(x, "color-interpolation", js.Array(value*))
    
    inline def `setColor-rendering`(value: ColorRenderingProperty | js.Array[ColorRenderingProperty]): Self = StObject.set(x, "color-rendering", value.asInstanceOf[js.Any])
    
    inline def `setColor-renderingUndefined`: Self = StObject.set(x, "color-rendering", js.undefined)
    
    inline def `setColor-renderingVarargs`(value: ColorRenderingProperty*): Self = StObject.set(x, "color-rendering", js.Array(value*))
    
    inline def `setDominant-baseline`(value: DominantBaselineProperty | js.Array[DominantBaselineProperty]): Self = StObject.set(x, "dominant-baseline", value.asInstanceOf[js.Any])
    
    inline def `setDominant-baselineUndefined`: Self = StObject.set(x, "dominant-baseline", js.undefined)
    
    inline def `setDominant-baselineVarargs`(value: DominantBaselineProperty*): Self = StObject.set(x, "dominant-baseline", js.Array(value*))
    
    inline def setFill(value: FillProperty | js.Array[FillProperty]): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def `setFill-opacity`(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "fill-opacity", value.asInstanceOf[js.Any])
    
    inline def `setFill-opacityUndefined`: Self = StObject.set(x, "fill-opacity", js.undefined)
    
    inline def `setFill-opacityVarargs`(value: GlobalsNumber*): Self = StObject.set(x, "fill-opacity", js.Array(value*))
    
    inline def `setFill-rule`(value: FillRuleProperty | js.Array[FillRuleProperty]): Self = StObject.set(x, "fill-rule", value.asInstanceOf[js.Any])
    
    inline def `setFill-ruleUndefined`: Self = StObject.set(x, "fill-rule", js.undefined)
    
    inline def `setFill-ruleVarargs`(value: FillRuleProperty*): Self = StObject.set(x, "fill-rule", js.Array(value*))
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setFillVarargs(value: FillProperty*): Self = StObject.set(x, "fill", js.Array(value*))
    
    inline def `setFlood-color`(value: FloodColorProperty | js.Array[FloodColorProperty]): Self = StObject.set(x, "flood-color", value.asInstanceOf[js.Any])
    
    inline def `setFlood-colorUndefined`: Self = StObject.set(x, "flood-color", js.undefined)
    
    inline def `setFlood-colorVarargs`(value: FloodColorProperty*): Self = StObject.set(x, "flood-color", js.Array(value*))
    
    inline def `setFlood-opacity`(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "flood-opacity", value.asInstanceOf[js.Any])
    
    inline def `setFlood-opacityUndefined`: Self = StObject.set(x, "flood-opacity", js.undefined)
    
    inline def `setFlood-opacityVarargs`(value: GlobalsNumber*): Self = StObject.set(x, "flood-opacity", js.Array(value*))
    
    inline def `setGlyph-orientation-vertical`(value: GlyphOrientationVerticalProperty | js.Array[GlyphOrientationVerticalProperty]): Self = StObject.set(x, "glyph-orientation-vertical", value.asInstanceOf[js.Any])
    
    inline def `setGlyph-orientation-verticalUndefined`: Self = StObject.set(x, "glyph-orientation-vertical", js.undefined)
    
    inline def `setGlyph-orientation-verticalVarargs`(value: GlyphOrientationVerticalProperty*): Self = StObject.set(x, "glyph-orientation-vertical", js.Array(value*))
    
    inline def `setLighting-color`(value: LightingColorProperty | js.Array[LightingColorProperty]): Self = StObject.set(x, "lighting-color", value.asInstanceOf[js.Any])
    
    inline def `setLighting-colorUndefined`: Self = StObject.set(x, "lighting-color", js.undefined)
    
    inline def `setLighting-colorVarargs`(value: LightingColorProperty*): Self = StObject.set(x, "lighting-color", js.Array(value*))
    
    inline def setMarker(value: MarkerProperty | js.Array[MarkerProperty]): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def `setMarker-end`(value: MarkerEndProperty | js.Array[MarkerEndProperty]): Self = StObject.set(x, "marker-end", value.asInstanceOf[js.Any])
    
    inline def `setMarker-endUndefined`: Self = StObject.set(x, "marker-end", js.undefined)
    
    inline def `setMarker-endVarargs`(value: MarkerEndProperty*): Self = StObject.set(x, "marker-end", js.Array(value*))
    
    inline def `setMarker-mid`(value: MarkerMidProperty | js.Array[MarkerMidProperty]): Self = StObject.set(x, "marker-mid", value.asInstanceOf[js.Any])
    
    inline def `setMarker-midUndefined`: Self = StObject.set(x, "marker-mid", js.undefined)
    
    inline def `setMarker-midVarargs`(value: MarkerMidProperty*): Self = StObject.set(x, "marker-mid", js.Array(value*))
    
    inline def `setMarker-start`(value: MarkerStartProperty | js.Array[MarkerStartProperty]): Self = StObject.set(x, "marker-start", value.asInstanceOf[js.Any])
    
    inline def `setMarker-startUndefined`: Self = StObject.set(x, "marker-start", js.undefined)
    
    inline def `setMarker-startVarargs`(value: MarkerStartProperty*): Self = StObject.set(x, "marker-start", js.Array(value*))
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def setMarkerVarargs(value: MarkerProperty*): Self = StObject.set(x, "marker", js.Array(value*))
    
    inline def `setShape-rendering`(value: ShapeRenderingProperty | js.Array[ShapeRenderingProperty]): Self = StObject.set(x, "shape-rendering", value.asInstanceOf[js.Any])
    
    inline def `setShape-renderingUndefined`: Self = StObject.set(x, "shape-rendering", js.undefined)
    
    inline def `setShape-renderingVarargs`(value: ShapeRenderingProperty*): Self = StObject.set(x, "shape-rendering", js.Array(value*))
    
    inline def `setStop-color`(value: StopColorProperty | js.Array[StopColorProperty]): Self = StObject.set(x, "stop-color", value.asInstanceOf[js.Any])
    
    inline def `setStop-colorUndefined`: Self = StObject.set(x, "stop-color", js.undefined)
    
    inline def `setStop-colorVarargs`(value: StopColorProperty*): Self = StObject.set(x, "stop-color", js.Array(value*))
    
    inline def `setStop-opacity`(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "stop-opacity", value.asInstanceOf[js.Any])
    
    inline def `setStop-opacityUndefined`: Self = StObject.set(x, "stop-opacity", js.undefined)
    
    inline def `setStop-opacityVarargs`(value: GlobalsNumber*): Self = StObject.set(x, "stop-opacity", js.Array(value*))
    
    inline def setStroke(value: StrokeProperty | js.Array[StrokeProperty]): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def `setStroke-dasharray`(value: StrokeDasharrayProperty[TLength] | js.Array[StrokeDasharrayProperty[TLength]]): Self = StObject.set(x, "stroke-dasharray", value.asInstanceOf[js.Any])
    
    inline def `setStroke-dasharrayUndefined`: Self = StObject.set(x, "stroke-dasharray", js.undefined)
    
    inline def `setStroke-dasharrayVarargs`(value: StrokeDasharrayProperty[TLength]*): Self = StObject.set(x, "stroke-dasharray", js.Array(value*))
    
    inline def `setStroke-dashoffset`(value: StrokeDashoffsetProperty[TLength] | js.Array[StrokeDashoffsetProperty[TLength]]): Self = StObject.set(x, "stroke-dashoffset", value.asInstanceOf[js.Any])
    
    inline def `setStroke-dashoffsetUndefined`: Self = StObject.set(x, "stroke-dashoffset", js.undefined)
    
    inline def `setStroke-dashoffsetVarargs`(value: StrokeDashoffsetProperty[TLength]*): Self = StObject.set(x, "stroke-dashoffset", js.Array(value*))
    
    inline def `setStroke-linecap`(value: StrokeLinecapProperty | js.Array[StrokeLinecapProperty]): Self = StObject.set(x, "stroke-linecap", value.asInstanceOf[js.Any])
    
    inline def `setStroke-linecapUndefined`: Self = StObject.set(x, "stroke-linecap", js.undefined)
    
    inline def `setStroke-linecapVarargs`(value: StrokeLinecapProperty*): Self = StObject.set(x, "stroke-linecap", js.Array(value*))
    
    inline def `setStroke-linejoin`(value: StrokeLinejoinProperty | js.Array[StrokeLinejoinProperty]): Self = StObject.set(x, "stroke-linejoin", value.asInstanceOf[js.Any])
    
    inline def `setStroke-linejoinUndefined`: Self = StObject.set(x, "stroke-linejoin", js.undefined)
    
    inline def `setStroke-linejoinVarargs`(value: StrokeLinejoinProperty*): Self = StObject.set(x, "stroke-linejoin", js.Array(value*))
    
    inline def `setStroke-miterlimit`(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "stroke-miterlimit", value.asInstanceOf[js.Any])
    
    inline def `setStroke-miterlimitUndefined`: Self = StObject.set(x, "stroke-miterlimit", js.undefined)
    
    inline def `setStroke-miterlimitVarargs`(value: GlobalsNumber*): Self = StObject.set(x, "stroke-miterlimit", js.Array(value*))
    
    inline def `setStroke-opacity`(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "stroke-opacity", value.asInstanceOf[js.Any])
    
    inline def `setStroke-opacityUndefined`: Self = StObject.set(x, "stroke-opacity", js.undefined)
    
    inline def `setStroke-opacityVarargs`(value: GlobalsNumber*): Self = StObject.set(x, "stroke-opacity", js.Array(value*))
    
    inline def `setStroke-width`(value: StrokeWidthProperty[TLength] | js.Array[StrokeWidthProperty[TLength]]): Self = StObject.set(x, "stroke-width", value.asInstanceOf[js.Any])
    
    inline def `setStroke-widthUndefined`: Self = StObject.set(x, "stroke-width", js.undefined)
    
    inline def `setStroke-widthVarargs`(value: StrokeWidthProperty[TLength]*): Self = StObject.set(x, "stroke-width", js.Array(value*))
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setStrokeVarargs(value: StrokeProperty*): Self = StObject.set(x, "stroke", js.Array(value*))
    
    inline def `setText-anchor`(value: TextAnchorProperty | js.Array[TextAnchorProperty]): Self = StObject.set(x, "text-anchor", value.asInstanceOf[js.Any])
    
    inline def `setText-anchorUndefined`: Self = StObject.set(x, "text-anchor", js.undefined)
    
    inline def `setText-anchorVarargs`(value: TextAnchorProperty*): Self = StObject.set(x, "text-anchor", js.Array(value*))
    
    inline def `setVector-effect`(value: VectorEffectProperty | js.Array[VectorEffectProperty]): Self = StObject.set(x, "vector-effect", value.asInstanceOf[js.Any])
    
    inline def `setVector-effectUndefined`: Self = StObject.set(x, "vector-effect", js.undefined)
    
    inline def `setVector-effectVarargs`(value: VectorEffectProperty*): Self = StObject.set(x, "vector-effect", js.Array(value*))
  }
}
