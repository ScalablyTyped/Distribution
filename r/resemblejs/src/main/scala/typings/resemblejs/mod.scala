package typings.resemblejs

import typings.resemblejs.anon.Blue
import typings.resemblejs.anon.Bottom
import typings.resemblejs.anon.Height
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Retrieve basic analysis for a single image (add compareTo to compare with another).
    */
  @JSImport("resemblejs", JSImport.Namespace)
  @js.native
  def apply(image: String): ResembleAnalysis = js.native
  @JSImport("resemblejs", JSImport.Namespace)
  @js.native
  def apply(image: ImageData): ResembleAnalysis = js.native
  
  /**
    * Set the resemblance image output style
    */
  @JSImport("resemblejs", "outputSettings")
  @js.native
  def outputSettings(settings: OutputSettings_): js.Any = js.native
  
  @js.native
  trait OutputSettings_ extends StObject {
    
    var errorColor: Blue = js.native
    
    var errorType: String = js.native
    
    var largeImageThreshold: Double = js.native
    
    var transparency: Double = js.native
  }
  object OutputSettings_ {
    
    @scala.inline
    def apply(errorColor: Blue, errorType: String, largeImageThreshold: Double, transparency: Double): OutputSettings_ = {
      val __obj = js.Dynamic.literal(errorColor = errorColor.asInstanceOf[js.Any], errorType = errorType.asInstanceOf[js.Any], largeImageThreshold = largeImageThreshold.asInstanceOf[js.Any], transparency = transparency.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutputSettings_]
    }
    
    @scala.inline
    implicit class OutputSettings_MutableBuilder[Self <: OutputSettings_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorColor(value: Blue): Self = StObject.set(x, "errorColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorType(value: String): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLargeImageThreshold(value: Double): Self = StObject.set(x, "largeImageThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransparency(value: Double): Self = StObject.set(x, "transparency", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResembleAnalysis extends StObject {
    
    /**
      * Compare this image to another image, to get resemblance data
      */
    def compareTo(fileData: String): ResembleComparison = js.native
    def compareTo(fileData: ImageData): ResembleComparison = js.native
    
    /**
      * Run the analysis on this image and get the result
      */
    def onComplete(callback: js.Function1[/* result */ ResembleAnalysisResult, Unit]): Unit = js.native
  }
  
  @js.native
  trait ResembleAnalysisResult extends StObject {
    
    var blue: Double = js.native
    
    var brightness: Double = js.native
    
    var green: Double = js.native
    
    var red: Double = js.native
  }
  object ResembleAnalysisResult {
    
    @scala.inline
    def apply(blue: Double, brightness: Double, green: Double, red: Double): ResembleAnalysisResult = {
      val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], brightness = brightness.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResembleAnalysisResult]
    }
    
    @scala.inline
    implicit class ResembleAnalysisResultMutableBuilder[Self <: ResembleAnalysisResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrightness(value: Double): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResembleComparison extends StObject {
    
    def ignoreAntialiasing(): ResembleComparison = js.native
    
    def ignoreColors(): ResembleComparison = js.native
    
    def ignoreNothing(): ResembleComparison = js.native
    
    /**
      * Run the analysis and get the comparison result
      */
    def onComplete(callback: js.Function1[/* result */ ResembleComparisonResult, Unit]): Unit = js.native
    
    def repaint(): ResembleComparison = js.native
  }
  object ResembleComparison {
    
    @scala.inline
    def apply(
      ignoreAntialiasing: () => ResembleComparison,
      ignoreColors: () => ResembleComparison,
      ignoreNothing: () => ResembleComparison,
      onComplete: js.Function1[/* result */ ResembleComparisonResult, Unit] => Unit,
      repaint: () => ResembleComparison
    ): ResembleComparison = {
      val __obj = js.Dynamic.literal(ignoreAntialiasing = js.Any.fromFunction0(ignoreAntialiasing), ignoreColors = js.Any.fromFunction0(ignoreColors), ignoreNothing = js.Any.fromFunction0(ignoreNothing), onComplete = js.Any.fromFunction1(onComplete), repaint = js.Any.fromFunction0(repaint))
      __obj.asInstanceOf[ResembleComparison]
    }
    
    @scala.inline
    implicit class ResembleComparisonMutableBuilder[Self <: ResembleComparison] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIgnoreAntialiasing(value: () => ResembleComparison): Self = StObject.set(x, "ignoreAntialiasing", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIgnoreColors(value: () => ResembleComparison): Self = StObject.set(x, "ignoreColors", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIgnoreNothing(value: () => ResembleComparison): Self = StObject.set(x, "ignoreNothing", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnComplete(value: js.Function1[/* result */ ResembleComparisonResult, Unit] => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRepaint(value: () => ResembleComparison): Self = StObject.set(x, "repaint", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ResembleComparisonResult extends StObject {
    
    var analysisTime: Double = js.native
    
    var diffBounds: Bottom = js.native
    
    /**
      * The difference in width and height between the dimensions of the two compared images
      */
    var dimensionDifference: Height = js.native
    
    /**
      * Get a data URL for the comparison image
      */
    def getImageDataUrl(): String = js.native
    
    /**
      * Do the two images have the same dimensions?
      */
    var isSameDimensions: Boolean = js.native
    
    /**
      * The percentage of pixels which do not match between the images
      */
    var misMatchPercentage: Double = js.native
  }
  object ResembleComparisonResult {
    
    @scala.inline
    def apply(
      analysisTime: Double,
      diffBounds: Bottom,
      dimensionDifference: Height,
      getImageDataUrl: () => String,
      isSameDimensions: Boolean,
      misMatchPercentage: Double
    ): ResembleComparisonResult = {
      val __obj = js.Dynamic.literal(analysisTime = analysisTime.asInstanceOf[js.Any], diffBounds = diffBounds.asInstanceOf[js.Any], dimensionDifference = dimensionDifference.asInstanceOf[js.Any], getImageDataUrl = js.Any.fromFunction0(getImageDataUrl), isSameDimensions = isSameDimensions.asInstanceOf[js.Any], misMatchPercentage = misMatchPercentage.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResembleComparisonResult]
    }
    
    @scala.inline
    implicit class ResembleComparisonResultMutableBuilder[Self <: ResembleComparisonResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnalysisTime(value: Double): Self = StObject.set(x, "analysisTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiffBounds(value: Bottom): Self = StObject.set(x, "diffBounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimensionDifference(value: Height): Self = StObject.set(x, "dimensionDifference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetImageDataUrl(value: () => String): Self = StObject.set(x, "getImageDataUrl", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsSameDimensions(value: Boolean): Self = StObject.set(x, "isSameDimensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMisMatchPercentage(value: Double): Self = StObject.set(x, "misMatchPercentage", value.asInstanceOf[js.Any])
    }
  }
}
