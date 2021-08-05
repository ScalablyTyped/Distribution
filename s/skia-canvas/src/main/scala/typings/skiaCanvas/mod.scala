package typings.skiaCanvas

import typings.node.Buffer
import typings.skiaCanvas.anon.Format
import typings.skiaCanvas.anon.Page
import typings.skiaCanvas.skiaCanvasStrings.`2d`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("skia-canvas", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("skia-canvas", "Canvas")
  @js.native
  class Canvas protected () extends StObject {
    def this(width: Double, height: Double) = this()
    
    @JSName("getContext")
    def getContext_2d(`type`: `2d`): CanvasRenderingContext2D = js.native
    
    def height: Double = js.native
    
    def jpg: Buffer = js.native
    
    def newPage(width: Double, height: Double): CanvasRenderingContext2D = js.native
    
    def pages: js.Array[CanvasRenderingContext2D] = js.native
    
    def pdf: Buffer = js.native
    
    def png: Buffer = js.native
    
    def saveAs(filename: String): Unit = js.native
    def saveAs(filename: String, options: Format): Unit = js.native
    
    def svg: Buffer = js.native
    
    def toBuffer(format: String): Buffer = js.native
    def toBuffer(format: String, options: Page): Buffer = js.native
    
    def toDataURL(format: String): String = js.native
    def toDataURL(format: String, options: Page): String = js.native
    
    def width: Double = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.CanvasGradient * / any */ @JSImport("skia-canvas", "CanvasGradient")
  @js.native
  class CanvasGradient () extends StObject
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.CanvasPattern * / any */ @JSImport("skia-canvas", "CanvasPattern")
  @js.native
  class CanvasPattern () extends StObject
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.CanvasRenderingContext2D * / any */ @JSImport("skia-canvas", "CanvasRenderingContext2D")
  @js.native
  class CanvasRenderingContext2D () extends StObject {
    
    var fontVariant: String = js.native
    
    def measureText(text: String): TextMetrics = js.native
    
    var textTracking: Double = js.native
    
    var textWrap: Boolean = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.DOMMatrix * / any */ @JSImport("skia-canvas", "DOMMatrix")
  @js.native
  class DOMMatrix () extends StObject
  
  @js.native
  trait FontLibrary extends StObject {
    
    var families: js.Array[String] = js.native
    
    def family(name: String): js.UndefOr[FontFamily] = js.native
    
    def has(familyName: String): Boolean = js.native
    
    def use(families: Record[String, js.Array[String] | String]): Record[String, js.Array[FontVariant] | FontVariant] = js.native
    def use(familyName: String, fontPaths: js.Array[String]): js.Array[FontVariant] = js.native
    def use(fontPaths: js.Array[String]): js.Array[FontVariant] = js.native
  }
  @JSImport("skia-canvas", "FontLibrary")
  @js.native
  val FontLibrary: typings.skiaCanvas.mod.FontLibrary = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Image * / any */ @JSImport("skia-canvas", "Image")
  @js.native
  class Image () extends StObject
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.ImageData * / any */ @JSImport("skia-canvas", "ImageData")
  @js.native
  class ImageData () extends StObject
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Path2D * / any */ @JSImport("skia-canvas", "Path2D")
  @js.native
  class Path2D () extends StObject
  
  inline def loadImage(src: String): js.Promise[Image] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadImage")(src.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Image]]
  inline def loadImage(src: Buffer): js.Promise[Image] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadImage")(src.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Image]]
  
  trait FontFamily extends StObject {
    
    var family: String
    
    var styles: js.Array[String]
    
    var weights: js.Array[Double]
    
    var widths: js.Array[String]
  }
  object FontFamily {
    
    inline def apply(family: String, styles: js.Array[String], weights: js.Array[Double], widths: js.Array[String]): FontFamily = {
      val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], weights = weights.asInstanceOf[js.Any], widths = widths.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontFamily]
    }
    
    extension [Self <: FontFamily](x: Self) {
      
      inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setStyles(value: js.Array[String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesVarargs(value: String*): Self = StObject.set(x, "styles", js.Array(value :_*))
      
      inline def setWeights(value: js.Array[Double]): Self = StObject.set(x, "weights", value.asInstanceOf[js.Any])
      
      inline def setWeightsVarargs(value: Double*): Self = StObject.set(x, "weights", js.Array(value :_*))
      
      inline def setWidths(value: js.Array[String]): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
      
      inline def setWidthsVarargs(value: String*): Self = StObject.set(x, "widths", js.Array(value :_*))
    }
  }
  
  trait FontVariant extends StObject {
    
    var family: String
    
    var file: String
    
    var style: String
    
    var weight: Double
    
    var width: String
  }
  object FontVariant {
    
    inline def apply(family: String, file: String, style: String, weight: Double, width: String): FontVariant = {
      val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontVariant]
    }
    
    extension [Self <: FontVariant](x: Self) {
      
      inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.TextMetrics * / any */ trait TextMetrics extends StObject {
    
    var lines: js.Array[TextMetricsLine]
  }
  object TextMetrics {
    
    inline def apply(lines: js.Array[TextMetricsLine]): TextMetrics = {
      val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextMetrics]
    }
    
    extension [Self <: TextMetrics](x: Self) {
      
      inline def setLines(value: js.Array[TextMetricsLine]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setLinesVarargs(value: TextMetricsLine*): Self = StObject.set(x, "lines", js.Array(value :_*))
    }
  }
  
  trait TextMetricsLine extends StObject {
    
    var baseline: Double
    
    var endIndex: Double
    
    var height: Double
    
    var startIndex: Double
    
    var x: Double
    
    var y: Double
  }
  object TextMetricsLine {
    
    inline def apply(baseline: Double, endIndex: Double, height: Double, startIndex: Double, x: Double, y: Double): TextMetricsLine = {
      val __obj = js.Dynamic.literal(baseline = baseline.asInstanceOf[js.Any], endIndex = endIndex.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextMetricsLine]
    }
    
    extension [Self <: TextMetricsLine](x: Self) {
      
      inline def setBaseline(value: Double): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
      
      inline def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
