package typings.projectOxford.mod

import typings.node.streamMod.Stream
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Options {
  
  trait Analyze extends StObject {
    
    // Detects if faces are present.If present, generate coordinates, gender and age.
    var Adult: js.UndefOr[Boolean] = js.undefined
    
    // Detects if image is pornographic in nature(nudity or sex act).Sexually suggestive content is also detected.
    var Categories: js.UndefOr[Boolean] = js.undefined
    
    // Detects if image is clipart or a line drawing.
    var Color: js.UndefOr[Boolean] = js.undefined
    
    // Determines the accent color, dominant color, if image is black& white.
    var Faces: js.UndefOr[Boolean] = js.undefined
    
    // Path to image to be analyzed
    var ImageType: js.UndefOr[Boolean] = js.undefined
    
    // Url to image to be analyzed
    var path: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Analyze {
    
    inline def apply(): Analyze = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Analyze]
    }
    
    extension [Self <: Analyze](x: Self) {
      
      inline def setAdult(value: Boolean): Self = StObject.set(x, "Adult", value.asInstanceOf[js.Any])
      
      inline def setAdultUndefined: Self = StObject.set(x, "Adult", js.undefined)
      
      inline def setCategories(value: Boolean): Self = StObject.set(x, "Categories", value.asInstanceOf[js.Any])
      
      inline def setCategoriesUndefined: Self = StObject.set(x, "Categories", js.undefined)
      
      inline def setColor(value: Boolean): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "Color", js.undefined)
      
      inline def setFaces(value: Boolean): Self = StObject.set(x, "Faces", value.asInstanceOf[js.Any])
      
      inline def setFacesUndefined: Self = StObject.set(x, "Faces", js.undefined)
      
      inline def setImageType(value: Boolean): Self = StObject.set(x, "ImageType", value.asInstanceOf[js.Any])
      
      inline def setImageTypeUndefined: Self = StObject.set(x, "ImageType", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait Detect extends StObject {
    
    // Analyze face landmarks?
    var analyzesAge: js.UndefOr[Boolean] = js.undefined
    
    // Stream of an image to be used
    var analyzesFaceLandmarks: js.UndefOr[Boolean] = js.undefined
    
    // Analyze age?
    var analyzesGender: js.UndefOr[Boolean] = js.undefined
    
    // Analyze gender?
    var analyzesHeadPose: js.UndefOr[Boolean] = js.undefined
    
    // URL to image to be used
    var path: js.UndefOr[String] = js.undefined
    
    // Path to image to be used
    var stream: js.UndefOr[Stream] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Detect {
    
    inline def apply(): Detect = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Detect]
    }
    
    extension [Self <: Detect](x: Self) {
      
      inline def setAnalyzesAge(value: Boolean): Self = StObject.set(x, "analyzesAge", value.asInstanceOf[js.Any])
      
      inline def setAnalyzesAgeUndefined: Self = StObject.set(x, "analyzesAge", js.undefined)
      
      inline def setAnalyzesFaceLandmarks(value: Boolean): Self = StObject.set(x, "analyzesFaceLandmarks", value.asInstanceOf[js.Any])
      
      inline def setAnalyzesFaceLandmarksUndefined: Self = StObject.set(x, "analyzesFaceLandmarks", js.undefined)
      
      inline def setAnalyzesGender(value: Boolean): Self = StObject.set(x, "analyzesGender", value.asInstanceOf[js.Any])
      
      inline def setAnalyzesGenderUndefined: Self = StObject.set(x, "analyzesGender", js.undefined)
      
      inline def setAnalyzesHeadPose(value: Boolean): Self = StObject.set(x, "analyzesHeadPose", value.asInstanceOf[js.Any])
      
      inline def setAnalyzesHeadPoseUndefined: Self = StObject.set(x, "analyzesHeadPose", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setStream(value: Stream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait Identify extends StObject {
    
    var maxNumOfCandidatesReturned: Double
    
    var personGroupId: String
  }
  object Identify {
    
    inline def apply(maxNumOfCandidatesReturned: Double, personGroupId: String): Identify = {
      val __obj = js.Dynamic.literal(maxNumOfCandidatesReturned = maxNumOfCandidatesReturned.asInstanceOf[js.Any], personGroupId = personGroupId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Identify]
    }
    
    extension [Self <: Identify](x: Self) {
      
      inline def setMaxNumOfCandidatesReturned(value: Double): Self = StObject.set(x, "maxNumOfCandidatesReturned", value.asInstanceOf[js.Any])
      
      inline def setPersonGroupId(value: String): Self = StObject.set(x, "personGroupId", value.asInstanceOf[js.Any])
    }
  }
  
  trait Ocr extends StObject {
    
    //BCP - 47 language code of the text to be detected in the image.Default value is "unk", then the service will auto detect the language of the text in the image.
    var detectOrientation: js.UndefOr[Boolean] = js.undefined
    
    // Path to image to be analyzed
    var language: js.UndefOr[String] = js.undefined
    
    // URL to image to be analyzed
    var path: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Ocr {
    
    inline def apply(): Ocr = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ocr]
    }
    
    extension [Self <: Ocr](x: Self) {
      
      inline def setDetectOrientation(value: Boolean): Self = StObject.set(x, "detectOrientation", value.asInstanceOf[js.Any])
      
      inline def setDetectOrientationUndefined: Self = StObject.set(x, "detectOrientation", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait Thumbnail extends StObject {
    
    // Width of the thumb in pixels
    var height: js.UndefOr[Double] = js.undefined
    
    // Url to image to be thumbnailed
    var path: js.UndefOr[String] = js.undefined
    
    // Should SmartCropping be enabled?
    var pipe: js.UndefOr[Writable] = js.undefined
    
    // Height of the thumb in pixels
    var smartCropping: js.UndefOr[Boolean] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    // Path to image to be thumbnailed
    var width: js.UndefOr[Double] = js.undefined
  }
  object Thumbnail {
    
    inline def apply(): Thumbnail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Thumbnail]
    }
    
    extension [Self <: Thumbnail](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPipe(value: Writable): Self = StObject.set(x, "pipe", value.asInstanceOf[js.Any])
      
      inline def setPipeUndefined: Self = StObject.set(x, "pipe", js.undefined)
      
      inline def setSmartCropping(value: Boolean): Self = StObject.set(x, "smartCropping", value.asInstanceOf[js.Any])
      
      inline def setSmartCroppingUndefined: Self = StObject.set(x, "smartCropping", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
