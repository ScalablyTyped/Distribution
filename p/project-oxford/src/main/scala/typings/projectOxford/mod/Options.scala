package typings.projectOxford.mod

import typings.node.streamMod.Stream
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Options {
  
  @js.native
  trait Analyze extends StObject {
    
    // Detects if faces are present.If present, generate coordinates, gender and age.
    var Adult: js.UndefOr[Boolean] = js.native
    
    // Detects if image is pornographic in nature(nudity or sex act).Sexually suggestive content is also detected.
    var Categories: js.UndefOr[Boolean] = js.native
    
    // Detects if image is clipart or a line drawing.
    var Color: js.UndefOr[Boolean] = js.native
    
    // Determines the accent color, dominant color, if image is black& white.
    var Faces: js.UndefOr[Boolean] = js.native
    
    // Path to image to be analyzed
    var ImageType: js.UndefOr[Boolean] = js.native
    
    // Url to image to be analyzed
    var path: js.UndefOr[String] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object Analyze {
    
    @scala.inline
    def apply(): Analyze = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Analyze]
    }
    
    @scala.inline
    implicit class AnalyzeMutableBuilder[Self <: Analyze] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdult(value: Boolean): Self = StObject.set(x, "Adult", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdultUndefined: Self = StObject.set(x, "Adult", js.undefined)
      
      @scala.inline
      def setCategories(value: Boolean): Self = StObject.set(x, "Categories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoriesUndefined: Self = StObject.set(x, "Categories", js.undefined)
      
      @scala.inline
      def setColor(value: Boolean): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "Color", js.undefined)
      
      @scala.inline
      def setFaces(value: Boolean): Self = StObject.set(x, "Faces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFacesUndefined: Self = StObject.set(x, "Faces", js.undefined)
      
      @scala.inline
      def setImageType(value: Boolean): Self = StObject.set(x, "ImageType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageTypeUndefined: Self = StObject.set(x, "ImageType", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait Detect extends StObject {
    
    // Analyze face landmarks?
    var analyzesAge: js.UndefOr[Boolean] = js.native
    
    // Stream of an image to be used
    var analyzesFaceLandmarks: js.UndefOr[Boolean] = js.native
    
    // Analyze age?
    var analyzesGender: js.UndefOr[Boolean] = js.native
    
    // Analyze gender?
    var analyzesHeadPose: js.UndefOr[Boolean] = js.native
    
    // URL to image to be used
    var path: js.UndefOr[String] = js.native
    
    // Path to image to be used
    var stream: js.UndefOr[Stream] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object Detect {
    
    @scala.inline
    def apply(): Detect = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Detect]
    }
    
    @scala.inline
    implicit class DetectMutableBuilder[Self <: Detect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnalyzesAge(value: Boolean): Self = StObject.set(x, "analyzesAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnalyzesAgeUndefined: Self = StObject.set(x, "analyzesAge", js.undefined)
      
      @scala.inline
      def setAnalyzesFaceLandmarks(value: Boolean): Self = StObject.set(x, "analyzesFaceLandmarks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnalyzesFaceLandmarksUndefined: Self = StObject.set(x, "analyzesFaceLandmarks", js.undefined)
      
      @scala.inline
      def setAnalyzesGender(value: Boolean): Self = StObject.set(x, "analyzesGender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnalyzesGenderUndefined: Self = StObject.set(x, "analyzesGender", js.undefined)
      
      @scala.inline
      def setAnalyzesHeadPose(value: Boolean): Self = StObject.set(x, "analyzesHeadPose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnalyzesHeadPoseUndefined: Self = StObject.set(x, "analyzesHeadPose", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setStream(value: Stream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait Identify extends StObject {
    
    var maxNumOfCandidatesReturned: Double = js.native
    
    var personGroupId: String = js.native
  }
  object Identify {
    
    @scala.inline
    def apply(maxNumOfCandidatesReturned: Double, personGroupId: String): Identify = {
      val __obj = js.Dynamic.literal(maxNumOfCandidatesReturned = maxNumOfCandidatesReturned.asInstanceOf[js.Any], personGroupId = personGroupId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Identify]
    }
    
    @scala.inline
    implicit class IdentifyMutableBuilder[Self <: Identify] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxNumOfCandidatesReturned(value: Double): Self = StObject.set(x, "maxNumOfCandidatesReturned", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersonGroupId(value: String): Self = StObject.set(x, "personGroupId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Ocr extends StObject {
    
    //BCP - 47 language code of the text to be detected in the image.Default value is "unk", then the service will auto detect the language of the text in the image.
    var detectOrientation: js.UndefOr[Boolean] = js.native
    
    // Path to image to be analyzed
    var language: js.UndefOr[String] = js.native
    
    // URL to image to be analyzed
    var path: js.UndefOr[String] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object Ocr {
    
    @scala.inline
    def apply(): Ocr = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ocr]
    }
    
    @scala.inline
    implicit class OcrMutableBuilder[Self <: Ocr] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetectOrientation(value: Boolean): Self = StObject.set(x, "detectOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetectOrientationUndefined: Self = StObject.set(x, "detectOrientation", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait Thumbnail extends StObject {
    
    // Width of the thumb in pixels
    var height: js.UndefOr[Double] = js.native
    
    // Url to image to be thumbnailed
    var path: js.UndefOr[String] = js.native
    
    // Should SmartCropping be enabled?
    var pipe: js.UndefOr[Writable] = js.native
    
    // Height of the thumb in pixels
    var smartCropping: js.UndefOr[Boolean] = js.native
    
    var url: js.UndefOr[String] = js.native
    
    // Path to image to be thumbnailed
    var width: js.UndefOr[Double] = js.native
  }
  object Thumbnail {
    
    @scala.inline
    def apply(): Thumbnail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Thumbnail]
    }
    
    @scala.inline
    implicit class ThumbnailMutableBuilder[Self <: Thumbnail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPipe(value: Writable): Self = StObject.set(x, "pipe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPipeUndefined: Self = StObject.set(x, "pipe", js.undefined)
      
      @scala.inline
      def setSmartCropping(value: Boolean): Self = StObject.set(x, "smartCropping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmartCroppingUndefined: Self = StObject.set(x, "smartCropping", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
