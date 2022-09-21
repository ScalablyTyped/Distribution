package typings.resemblejs

import typings.node.bufferMod.global.Buffer
import typings.resemblejs.anon.Blue
import typings.resemblejs.anon.Height
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Retrieve basic analysis for a single image (add compareTo to compare with another).
    *
    * @param image - The image to analyze. Accepts a URL to an image, a Data URI, a ImageData object, or a Buffer.
    */
  inline def apply(image: String): Analysis = ^.asInstanceOf[js.Dynamic].apply(image.asInstanceOf[js.Any]).asInstanceOf[Analysis]
  inline def apply(image: Buffer): Analysis = ^.asInstanceOf[js.Dynamic].apply(image.asInstanceOf[js.Any]).asInstanceOf[Analysis]
  inline def apply(image: ImageData): Analysis = ^.asInstanceOf[js.Dynamic].apply(image.asInstanceOf[js.Any]).asInstanceOf[Analysis]
  
  @JSImport("resemblejs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compare(image1: String, image2: String, options: ComparisonCallback, callback: ComparisonCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def compare(image1: String, image2: String, options: ComparisonOptions, callback: ComparisonCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def compare(image1: String, image2: Buffer, options: ComparisonCallback, callback: ComparisonCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def compare(image1: String, image2: Buffer, options: ComparisonOptions, callback: ComparisonCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def compare(image1: String, image2: ImageData, options: ComparisonCallback, callback: ComparisonCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def compare(image1: String, image2: ImageData, options: ComparisonOptions, callback: ComparisonCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def compare(image1: Buffer, image2: String, options: ComparisonCallback, callback: ComparisonCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def compare(image1: Buffer, image2: String, options: ComparisonOptions, callback: ComparisonCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def compare(image1: Buffer, image2: Buffer, options: ComparisonCallback, callback: ComparisonCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def compare(image1: Buffer, image2: Buffer, options: ComparisonOptions, callback: ComparisonCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def compare(image1: Buffer, image2: ImageData, options: ComparisonCallback, callback: ComparisonCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def compare(image1: Buffer, image2: ImageData, options: ComparisonOptions, callback: ComparisonCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def compare(image1: ImageData, image2: String, options: ComparisonCallback, callback: ComparisonCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def compare(image1: ImageData, image2: String, options: ComparisonOptions, callback: ComparisonCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def compare(image1: ImageData, image2: Buffer, options: ComparisonCallback, callback: ComparisonCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def compare(image1: ImageData, image2: Buffer, options: ComparisonOptions, callback: ComparisonCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def compare(image1: ImageData, image2: ImageData, options: ComparisonCallback, callback: ComparisonCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def compare(image1: ImageData, image2: ImageData, options: ComparisonOptions, callback: ComparisonCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Set the resemblance image output style
    */
  inline def outputSettings(settings: OutputSettings_): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("outputSettings")(settings.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @js.native
  trait Analysis extends StObject {
    
    /**
      * Compare this image to another image, to get resemblance data
      */
    def compareTo(fileData: String): Comparison = js.native
    def compareTo(fileData: Buffer): Comparison = js.native
    def compareTo(fileData: ImageData): Comparison = js.native
    
    /**
      * Run the analysis on this image and get the result
      */
    def onComplete(callback: js.Function1[/* result */ AnalysisResult, Unit]): Unit = js.native
    
    /**
      * Set the resemblance image output style
      */
    def outputSettings(settings: OutputSettings_): Analysis = js.native
  }
  
  trait AnalysisResult extends StObject {
    
    var black: Double
    
    var blue: Double
    
    var brightness: Double
    
    var green: Double
    
    var red: Double
    
    var white: Double
  }
  object AnalysisResult {
    
    inline def apply(black: Double, blue: Double, brightness: Double, green: Double, red: Double, white: Double): AnalysisResult = {
      val __obj = js.Dynamic.literal(black = black.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], brightness = brightness.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any], white = white.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalysisResult]
    }
    
    extension [Self <: AnalysisResult](x: Self) {
      
      inline def setBlack(value: Double): Self = StObject.set(x, "black", value.asInstanceOf[js.Any])
      
      inline def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
      
      inline def setBrightness(value: Double): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
      
      inline def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
      
      inline def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
      
      inline def setWhite(value: Double): Self = StObject.set(x, "white", value.asInstanceOf[js.Any])
    }
  }
  
  trait Box extends StObject {
    
    var bottom: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
  }
  object Box {
    
    inline def apply(bottom: Double, left: Double, right: Double, top: Double): Box = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Box]
    }
    
    extension [Self <: Box](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait Color extends StObject {
    
    var a: Double
    
    var b: Double
    
    var g: Double
    
    var r: Double
  }
  object Color {
    
    inline def apply(a: Double, b: Double, g: Double, r: Double): Color = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[Color]
    }
    
    extension [Self <: Color](x: Self) {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  trait Comparison extends StObject {
    
    /**
      * Ignore alpha channel when comparing images
      *
      * This will disable ignoreAntialiasing and ignoreColors.
      */
    def ignoreAlpha(): Comparison
    
    /**
      * Ignore antialiasing when comparing images
      *
      * This will disable ignoreColors.
      */
    def ignoreAntialiasing(): Comparison
    
    /**
      * Ignore colors when comparing images
      *
      * This will diable ignoreAntialiasing.
      */
    def ignoreColors(): Comparison
    
    /**
      * Ignore as less as possible when comparing images
      *
      * This will disable ignoreAntialiasing and ignoreColors.
      */
    def ignoreLess(): Comparison
    
    /**
      * Ignore nothing when comparing images
      *
      * This will disable ignoreAntialiasing and ignoreColors.
      */
    def ignoreNothing(): Comparison
    
    /**
      * Run the analysis and get the comparison result
      */
    def onComplete(callback: js.Function1[/* data */ ComparisonResult, Unit]): Comparison
    
    /**
      * Set the resemblance image output style
      */
    def outputSettings(settings: OutputSettings_): Comparison
    
    /**
      * Redo the comparison (with the new settings)
      */
    def repaint(): Comparison
    
    /**
      * Scale second image to dimensions of the first one
      */
    def scaleToSameSize(): Comparison
    
    def setCustomTolerance(customSettings: Tolerance): Unit
    
    def setReturnEarlyThreshold(threshold: Double): Comparison
    
    /**
      * Use images' original size
      */
    def useOriginalSize(): Comparison
  }
  object Comparison {
    
    inline def apply(
      ignoreAlpha: () => Comparison,
      ignoreAntialiasing: () => Comparison,
      ignoreColors: () => Comparison,
      ignoreLess: () => Comparison,
      ignoreNothing: () => Comparison,
      onComplete: js.Function1[/* data */ ComparisonResult, Unit] => Comparison,
      outputSettings: OutputSettings_ => Comparison,
      repaint: () => Comparison,
      scaleToSameSize: () => Comparison,
      setCustomTolerance: Tolerance => Unit,
      setReturnEarlyThreshold: Double => Comparison,
      useOriginalSize: () => Comparison
    ): Comparison = {
      val __obj = js.Dynamic.literal(ignoreAlpha = js.Any.fromFunction0(ignoreAlpha), ignoreAntialiasing = js.Any.fromFunction0(ignoreAntialiasing), ignoreColors = js.Any.fromFunction0(ignoreColors), ignoreLess = js.Any.fromFunction0(ignoreLess), ignoreNothing = js.Any.fromFunction0(ignoreNothing), onComplete = js.Any.fromFunction1(onComplete), outputSettings = js.Any.fromFunction1(outputSettings), repaint = js.Any.fromFunction0(repaint), scaleToSameSize = js.Any.fromFunction0(scaleToSameSize), setCustomTolerance = js.Any.fromFunction1(setCustomTolerance), setReturnEarlyThreshold = js.Any.fromFunction1(setReturnEarlyThreshold), useOriginalSize = js.Any.fromFunction0(useOriginalSize))
      __obj.asInstanceOf[Comparison]
    }
    
    extension [Self <: Comparison](x: Self) {
      
      inline def setIgnoreAlpha(value: () => Comparison): Self = StObject.set(x, "ignoreAlpha", js.Any.fromFunction0(value))
      
      inline def setIgnoreAntialiasing(value: () => Comparison): Self = StObject.set(x, "ignoreAntialiasing", js.Any.fromFunction0(value))
      
      inline def setIgnoreColors(value: () => Comparison): Self = StObject.set(x, "ignoreColors", js.Any.fromFunction0(value))
      
      inline def setIgnoreLess(value: () => Comparison): Self = StObject.set(x, "ignoreLess", js.Any.fromFunction0(value))
      
      inline def setIgnoreNothing(value: () => Comparison): Self = StObject.set(x, "ignoreNothing", js.Any.fromFunction0(value))
      
      inline def setOnComplete(value: js.Function1[/* data */ ComparisonResult, Unit] => Comparison): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
      
      inline def setOutputSettings(value: OutputSettings_ => Comparison): Self = StObject.set(x, "outputSettings", js.Any.fromFunction1(value))
      
      inline def setRepaint(value: () => Comparison): Self = StObject.set(x, "repaint", js.Any.fromFunction0(value))
      
      inline def setScaleToSameSize(value: () => Comparison): Self = StObject.set(x, "scaleToSameSize", js.Any.fromFunction0(value))
      
      inline def setSetCustomTolerance(value: Tolerance => Unit): Self = StObject.set(x, "setCustomTolerance", js.Any.fromFunction1(value))
      
      inline def setSetReturnEarlyThreshold(value: Double => Comparison): Self = StObject.set(x, "setReturnEarlyThreshold", js.Any.fromFunction1(value))
      
      inline def setUseOriginalSize(value: () => Comparison): Self = StObject.set(x, "useOriginalSize", js.Any.fromFunction0(value))
    }
  }
  
  type ComparisonCallback = js.Function2[/* err */ Any, /* data */ ComparisonResult, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.resemblejs.resemblejsStrings.nothing
    - typings.resemblejs.resemblejsStrings.less
    - typings.resemblejs.resemblejsStrings.antialiasing
    - typings.resemblejs.resemblejsStrings.colors
    - typings.resemblejs.resemblejsStrings.alpha
  */
  trait ComparisonIgnoreOption extends StObject
  object ComparisonIgnoreOption {
    
    inline def alpha: typings.resemblejs.resemblejsStrings.alpha = "alpha".asInstanceOf[typings.resemblejs.resemblejsStrings.alpha]
    
    inline def antialiasing: typings.resemblejs.resemblejsStrings.antialiasing = "antialiasing".asInstanceOf[typings.resemblejs.resemblejsStrings.antialiasing]
    
    inline def colors: typings.resemblejs.resemblejsStrings.colors = "colors".asInstanceOf[typings.resemblejs.resemblejsStrings.colors]
    
    inline def less: typings.resemblejs.resemblejsStrings.less = "less".asInstanceOf[typings.resemblejs.resemblejsStrings.less]
    
    inline def nothing: typings.resemblejs.resemblejsStrings.nothing = "nothing".asInstanceOf[typings.resemblejs.resemblejsStrings.nothing]
  }
  
  trait ComparisonOptions extends StObject {
    
    var ignore: js.UndefOr[ComparisonIgnoreOption | js.Array[ComparisonIgnoreOption]] = js.undefined
    
    var output: js.UndefOr[OutputSettings_] = js.undefined
    
    var returnEarlyThreshold: js.UndefOr[Double] = js.undefined
    
    var scaleToSameSize: js.UndefOr[Boolean] = js.undefined
    
    var tolerance: js.UndefOr[Tolerance] = js.undefined
  }
  object ComparisonOptions {
    
    inline def apply(): ComparisonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComparisonOptions]
    }
    
    extension [Self <: ComparisonOptions](x: Self) {
      
      inline def setIgnore(value: ComparisonIgnoreOption | js.Array[ComparisonIgnoreOption]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: ComparisonIgnoreOption*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setOutput(value: OutputSettings_): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setReturnEarlyThreshold(value: Double): Self = StObject.set(x, "returnEarlyThreshold", value.asInstanceOf[js.Any])
      
      inline def setReturnEarlyThresholdUndefined: Self = StObject.set(x, "returnEarlyThreshold", js.undefined)
      
      inline def setScaleToSameSize(value: Boolean): Self = StObject.set(x, "scaleToSameSize", value.asInstanceOf[js.Any])
      
      inline def setScaleToSameSizeUndefined: Self = StObject.set(x, "scaleToSameSize", js.undefined)
      
      inline def setTolerance(value: Tolerance): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
      
      inline def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
    }
  }
  
  trait ComparisonResult extends StObject {
    
    /**
      * Time consumed by the comparison (in milliseconds)
      */
    var analysisTime: Double
    
    var diffBounds: Box
    
    /**
      * The difference in width and height between the dimensions of the two compared images
      */
    var dimensionDifference: Height
    
    /**
      * Error information if error encountered
      *
      * Note: If error encountered, other properties will be undefined
      */
    var error: js.UndefOr[Any] = js.undefined
    
    /**
      * Get data buffer
      */
    var getBuffer: js.UndefOr[js.Function1[/* includeOriginal */ Boolean, Buffer]] = js.undefined
    
    /**
      * Get a data URL for the comparison image
      */
    def getImageDataUrl(): String
    
    /**
      * Do the two images have the same dimensions?
      */
    var isSameDimensions: Boolean
    
    /**
      * Same as `rawMisMatchPercentage` but fixed to 2-digit after the decimal point
      */
    var misMatchPercentage: Double
    
    /**
      * The percentage of pixels which do not match between the images
      */
    var rawMisMatchPercentage: Double
  }
  object ComparisonResult {
    
    inline def apply(
      analysisTime: Double,
      diffBounds: Box,
      dimensionDifference: Height,
      getImageDataUrl: () => String,
      isSameDimensions: Boolean,
      misMatchPercentage: Double,
      rawMisMatchPercentage: Double
    ): ComparisonResult = {
      val __obj = js.Dynamic.literal(analysisTime = analysisTime.asInstanceOf[js.Any], diffBounds = diffBounds.asInstanceOf[js.Any], dimensionDifference = dimensionDifference.asInstanceOf[js.Any], getImageDataUrl = js.Any.fromFunction0(getImageDataUrl), isSameDimensions = isSameDimensions.asInstanceOf[js.Any], misMatchPercentage = misMatchPercentage.asInstanceOf[js.Any], rawMisMatchPercentage = rawMisMatchPercentage.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComparisonResult]
    }
    
    extension [Self <: ComparisonResult](x: Self) {
      
      inline def setAnalysisTime(value: Double): Self = StObject.set(x, "analysisTime", value.asInstanceOf[js.Any])
      
      inline def setDiffBounds(value: Box): Self = StObject.set(x, "diffBounds", value.asInstanceOf[js.Any])
      
      inline def setDimensionDifference(value: Height): Self = StObject.set(x, "dimensionDifference", value.asInstanceOf[js.Any])
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setGetBuffer(value: /* includeOriginal */ Boolean => Buffer): Self = StObject.set(x, "getBuffer", js.Any.fromFunction1(value))
      
      inline def setGetBufferUndefined: Self = StObject.set(x, "getBuffer", js.undefined)
      
      inline def setGetImageDataUrl(value: () => String): Self = StObject.set(x, "getImageDataUrl", js.Any.fromFunction0(value))
      
      inline def setIsSameDimensions(value: Boolean): Self = StObject.set(x, "isSameDimensions", value.asInstanceOf[js.Any])
      
      inline def setMisMatchPercentage(value: Double): Self = StObject.set(x, "misMatchPercentage", value.asInstanceOf[js.Any])
      
      inline def setRawMisMatchPercentage(value: Double): Self = StObject.set(x, "rawMisMatchPercentage", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.resemblejs.resemblejsStrings.flat
    - typings.resemblejs.resemblejsStrings.movement
    - typings.resemblejs.resemblejsStrings.flatDifferenceIntensity
    - typings.resemblejs.resemblejsStrings.movementDifferenceIntensity
    - typings.resemblejs.resemblejsStrings.diffOnly
  */
  trait OutputErrorType extends StObject
  object OutputErrorType {
    
    inline def diffOnly: typings.resemblejs.resemblejsStrings.diffOnly = "diffOnly".asInstanceOf[typings.resemblejs.resemblejsStrings.diffOnly]
    
    inline def flat: typings.resemblejs.resemblejsStrings.flat = "flat".asInstanceOf[typings.resemblejs.resemblejsStrings.flat]
    
    inline def flatDifferenceIntensity: typings.resemblejs.resemblejsStrings.flatDifferenceIntensity = "flatDifferenceIntensity".asInstanceOf[typings.resemblejs.resemblejsStrings.flatDifferenceIntensity]
    
    inline def movement: typings.resemblejs.resemblejsStrings.movement = "movement".asInstanceOf[typings.resemblejs.resemblejsStrings.movement]
    
    inline def movementDifferenceIntensity: typings.resemblejs.resemblejsStrings.movementDifferenceIntensity = "movementDifferenceIntensity".asInstanceOf[typings.resemblejs.resemblejsStrings.movementDifferenceIntensity]
  }
  
  trait OutputSettings_ extends StObject {
    
    var boundingBox: js.UndefOr[Box] = js.undefined
    
    var boundingBoxes: js.UndefOr[js.Array[Box]] = js.undefined
    
    var errorColor: js.UndefOr[Blue] = js.undefined
    
    var errorPixel: js.UndefOr[
        js.Function4[/* px */ js.Array[Double], /* offset */ Double, /* d1 */ Color, /* d2 */ Color, Unit]
      ] = js.undefined
    
    var errorType: js.UndefOr[OutputErrorType] = js.undefined
    
    var ignoreAreasColoredWith: js.UndefOr[Color] = js.undefined
    
    var ignoredBox: js.UndefOr[Box] = js.undefined
    
    var ignoredBoxes: js.UndefOr[js.Array[Box]] = js.undefined
    
    var largeImageThreshold: js.UndefOr[Double] = js.undefined
    
    var transparency: js.UndefOr[Double] = js.undefined
    
    var useCrossOrigin: js.UndefOr[Boolean] = js.undefined
  }
  object OutputSettings_ {
    
    inline def apply(): OutputSettings_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OutputSettings_]
    }
    
    extension [Self <: OutputSettings_](x: Self) {
      
      inline def setBoundingBox(value: Box): Self = StObject.set(x, "boundingBox", value.asInstanceOf[js.Any])
      
      inline def setBoundingBoxUndefined: Self = StObject.set(x, "boundingBox", js.undefined)
      
      inline def setBoundingBoxes(value: js.Array[Box]): Self = StObject.set(x, "boundingBoxes", value.asInstanceOf[js.Any])
      
      inline def setBoundingBoxesUndefined: Self = StObject.set(x, "boundingBoxes", js.undefined)
      
      inline def setBoundingBoxesVarargs(value: Box*): Self = StObject.set(x, "boundingBoxes", js.Array(value*))
      
      inline def setErrorColor(value: Blue): Self = StObject.set(x, "errorColor", value.asInstanceOf[js.Any])
      
      inline def setErrorColorUndefined: Self = StObject.set(x, "errorColor", js.undefined)
      
      inline def setErrorPixel(value: (/* px */ js.Array[Double], /* offset */ Double, /* d1 */ Color, /* d2 */ Color) => Unit): Self = StObject.set(x, "errorPixel", js.Any.fromFunction4(value))
      
      inline def setErrorPixelUndefined: Self = StObject.set(x, "errorPixel", js.undefined)
      
      inline def setErrorType(value: OutputErrorType): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
      
      inline def setErrorTypeUndefined: Self = StObject.set(x, "errorType", js.undefined)
      
      inline def setIgnoreAreasColoredWith(value: Color): Self = StObject.set(x, "ignoreAreasColoredWith", value.asInstanceOf[js.Any])
      
      inline def setIgnoreAreasColoredWithUndefined: Self = StObject.set(x, "ignoreAreasColoredWith", js.undefined)
      
      inline def setIgnoredBox(value: Box): Self = StObject.set(x, "ignoredBox", value.asInstanceOf[js.Any])
      
      inline def setIgnoredBoxUndefined: Self = StObject.set(x, "ignoredBox", js.undefined)
      
      inline def setIgnoredBoxes(value: js.Array[Box]): Self = StObject.set(x, "ignoredBoxes", value.asInstanceOf[js.Any])
      
      inline def setIgnoredBoxesUndefined: Self = StObject.set(x, "ignoredBoxes", js.undefined)
      
      inline def setIgnoredBoxesVarargs(value: Box*): Self = StObject.set(x, "ignoredBoxes", js.Array(value*))
      
      inline def setLargeImageThreshold(value: Double): Self = StObject.set(x, "largeImageThreshold", value.asInstanceOf[js.Any])
      
      inline def setLargeImageThresholdUndefined: Self = StObject.set(x, "largeImageThreshold", js.undefined)
      
      inline def setTransparency(value: Double): Self = StObject.set(x, "transparency", value.asInstanceOf[js.Any])
      
      inline def setTransparencyUndefined: Self = StObject.set(x, "transparency", js.undefined)
      
      inline def setUseCrossOrigin(value: Boolean): Self = StObject.set(x, "useCrossOrigin", value.asInstanceOf[js.Any])
      
      inline def setUseCrossOriginUndefined: Self = StObject.set(x, "useCrossOrigin", js.undefined)
    }
  }
  
  trait Tolerance extends StObject {
    
    var alpha: js.UndefOr[Double] = js.undefined
    
    var blue: js.UndefOr[Double] = js.undefined
    
    var green: js.UndefOr[Double] = js.undefined
    
    var maxBrightness: js.UndefOr[Double] = js.undefined
    
    var minBrightness: js.UndefOr[Double] = js.undefined
    
    var red: js.UndefOr[Double] = js.undefined
  }
  object Tolerance {
    
    inline def apply(): Tolerance = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Tolerance]
    }
    
    extension [Self <: Tolerance](x: Self) {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
      
      inline def setBlueUndefined: Self = StObject.set(x, "blue", js.undefined)
      
      inline def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
      
      inline def setGreenUndefined: Self = StObject.set(x, "green", js.undefined)
      
      inline def setMaxBrightness(value: Double): Self = StObject.set(x, "maxBrightness", value.asInstanceOf[js.Any])
      
      inline def setMaxBrightnessUndefined: Self = StObject.set(x, "maxBrightness", js.undefined)
      
      inline def setMinBrightness(value: Double): Self = StObject.set(x, "minBrightness", value.asInstanceOf[js.Any])
      
      inline def setMinBrightnessUndefined: Self = StObject.set(x, "minBrightness", js.undefined)
      
      inline def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
      
      inline def setRedUndefined: Self = StObject.set(x, "red", js.undefined)
    }
  }
}
