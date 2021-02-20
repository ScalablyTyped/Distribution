package typings.projectOxford.mod

import typings.projectOxford.anon.AccentColor
import typings.projectOxford.anon.AdultScore
import typings.projectOxford.anon.Age
import typings.projectOxford.anon.ClipArtType
import typings.projectOxford.anon.Format
import typings.projectOxford.anon.Lines
import typings.projectOxford.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VisionResponses {
  
  @js.native
  trait Analyze extends StObject {
    
    var adult: AdultScore = js.native
    
    var categories: js.Array[Name] = js.native
    
    var color: AccentColor = js.native
    
    var faces: js.Array[Age] = js.native
    
    var imageType: ClipArtType = js.native
    
    var metadata: Format = js.native
    
    var requestId: String = js.native
  }
  object Analyze {
    
    @scala.inline
    def apply(
      adult: AdultScore,
      categories: js.Array[Name],
      color: AccentColor,
      faces: js.Array[Age],
      imageType: ClipArtType,
      metadata: Format,
      requestId: String
    ): Analyze = {
      val __obj = js.Dynamic.literal(adult = adult.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], faces = faces.asInstanceOf[js.Any], imageType = imageType.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Analyze]
    }
    
    @scala.inline
    implicit class AnalyzeMutableBuilder[Self <: Analyze] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdult(value: AdultScore): Self = StObject.set(x, "adult", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategories(value: js.Array[Name]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoriesVarargs(value: Name*): Self = StObject.set(x, "categories", js.Array(value :_*))
      
      @scala.inline
      def setColor(value: AccentColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFaces(value: js.Array[Age]): Self = StObject.set(x, "faces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFacesVarargs(value: Age*): Self = StObject.set(x, "faces", js.Array(value :_*))
      
      @scala.inline
      def setImageType(value: ClipArtType): Self = StObject.set(x, "imageType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: Format): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Ocr extends StObject {
    
    var language: String = js.native
    
    var orientation: String = js.native
    
    var regions: js.Array[Lines] = js.native
    
    var textAngle: Double = js.native
  }
  object Ocr {
    
    @scala.inline
    def apply(language: String, orientation: String, regions: js.Array[Lines], textAngle: Double): Ocr = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], regions = regions.asInstanceOf[js.Any], textAngle = textAngle.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ocr]
    }
    
    @scala.inline
    implicit class OcrMutableBuilder[Self <: Ocr] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegions(value: js.Array[Lines]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionsVarargs(value: Lines*): Self = StObject.set(x, "regions", js.Array(value :_*))
      
      @scala.inline
      def setTextAngle(value: Double): Self = StObject.set(x, "textAngle", value.asInstanceOf[js.Any])
    }
  }
}
