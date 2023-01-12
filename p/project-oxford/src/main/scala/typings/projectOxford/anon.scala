package typings.projectOxford

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AccentColor extends StObject {
    
    var accentColor: String
    
    var dominantColorBackground: String
    
    var dominantColorForeground: String
    
    var dominantColors: js.Array[String]
    
    var isBWImg: Boolean
  }
  object AccentColor {
    
    inline def apply(
      accentColor: String,
      dominantColorBackground: String,
      dominantColorForeground: String,
      dominantColors: js.Array[String],
      isBWImg: Boolean
    ): AccentColor = {
      val __obj = js.Dynamic.literal(accentColor = accentColor.asInstanceOf[js.Any], dominantColorBackground = dominantColorBackground.asInstanceOf[js.Any], dominantColorForeground = dominantColorForeground.asInstanceOf[js.Any], dominantColors = dominantColors.asInstanceOf[js.Any], isBWImg = isBWImg.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccentColor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AccentColor] (val x: Self) extends AnyVal {
      
      inline def setAccentColor(value: String): Self = StObject.set(x, "accentColor", value.asInstanceOf[js.Any])
      
      inline def setDominantColorBackground(value: String): Self = StObject.set(x, "dominantColorBackground", value.asInstanceOf[js.Any])
      
      inline def setDominantColorForeground(value: String): Self = StObject.set(x, "dominantColorForeground", value.asInstanceOf[js.Any])
      
      inline def setDominantColors(value: js.Array[String]): Self = StObject.set(x, "dominantColors", value.asInstanceOf[js.Any])
      
      inline def setDominantColorsVarargs(value: String*): Self = StObject.set(x, "dominantColors", js.Array(value*))
      
      inline def setIsBWImg(value: Boolean): Self = StObject.set(x, "isBWImg", value.asInstanceOf[js.Any])
    }
  }
  
  trait AdultScore extends StObject {
    
    var adultScore: Double
    
    var isAdultContent: Boolean
    
    var isRacyContent: Boolean
    
    var racyScore: Double
  }
  object AdultScore {
    
    inline def apply(adultScore: Double, isAdultContent: Boolean, isRacyContent: Boolean, racyScore: Double): AdultScore = {
      val __obj = js.Dynamic.literal(adultScore = adultScore.asInstanceOf[js.Any], isAdultContent = isAdultContent.asInstanceOf[js.Any], isRacyContent = isRacyContent.asInstanceOf[js.Any], racyScore = racyScore.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdultScore]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AdultScore] (val x: Self) extends AnyVal {
      
      inline def setAdultScore(value: Double): Self = StObject.set(x, "adultScore", value.asInstanceOf[js.Any])
      
      inline def setIsAdultContent(value: Boolean): Self = StObject.set(x, "isAdultContent", value.asInstanceOf[js.Any])
      
      inline def setIsRacyContent(value: Boolean): Self = StObject.set(x, "isRacyContent", value.asInstanceOf[js.Any])
      
      inline def setRacyScore(value: Double): Self = StObject.set(x, "racyScore", value.asInstanceOf[js.Any])
    }
  }
  
  trait Age extends StObject {
    
    var age: Double
    
    var faceRectangle: Height
    
    var gender: String
  }
  object Age {
    
    inline def apply(age: Double, faceRectangle: Height, gender: String): Age = {
      val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], faceRectangle = faceRectangle.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any])
      __obj.asInstanceOf[Age]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Age] (val x: Self) extends AnyVal {
      
      inline def setAge(value: Double): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
      
      inline def setFaceRectangle(value: Height): Self = StObject.set(x, "faceRectangle", value.asInstanceOf[js.Any])
      
      inline def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    }
  }
  
  trait BoundingBox extends StObject {
    
    var boundingBox: String
    
    var text: String
  }
  object BoundingBox {
    
    inline def apply(boundingBox: String, text: String): BoundingBox = {
      val __obj = js.Dynamic.literal(boundingBox = boundingBox.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoundingBox]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BoundingBox] (val x: Self) extends AnyVal {
      
      inline def setBoundingBox(value: String): Self = StObject.set(x, "boundingBox", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClipArtType extends StObject {
    
    var clipArtType: Double
    
    var lineDrawingType: Double
  }
  object ClipArtType {
    
    inline def apply(clipArtType: Double, lineDrawingType: Double): ClipArtType = {
      val __obj = js.Dynamic.literal(clipArtType = clipArtType.asInstanceOf[js.Any], lineDrawingType = lineDrawingType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClipArtType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClipArtType] (val x: Self) extends AnyVal {
      
      inline def setClipArtType(value: Double): Self = StObject.set(x, "clipArtType", value.asInstanceOf[js.Any])
      
      inline def setLineDrawingType(value: Double): Self = StObject.set(x, "lineDrawingType", value.asInstanceOf[js.Any])
    }
  }
  
  trait Confidence extends StObject {
    
    var confidence: Double
    
    var personId: String
  }
  object Confidence {
    
    inline def apply(confidence: Double, personId: String): Confidence = {
      val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], personId = personId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Confidence]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Confidence] (val x: Self) extends AnyVal {
      
      inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
      
      inline def setPersonId(value: String): Self = StObject.set(x, "personId", value.asInstanceOf[js.Any])
    }
  }
  
  trait Format extends StObject {
    
    var format: String
    
    var height: Double
    
    var width: Double
  }
  object Format {
    
    inline def apply(format: String, height: Double, width: Double): Format = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Format]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var left: Double
    
    var top: Double
    
    var width: Double
  }
  object Height {
    
    inline def apply(height: Double, left: Double, top: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Lines extends StObject {
    
    var boundingBox: String
    
    var lines: js.Array[Words]
  }
  object Lines {
    
    inline def apply(boundingBox: String, lines: js.Array[Words]): Lines = {
      val __obj = js.Dynamic.literal(boundingBox = boundingBox.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any])
      __obj.asInstanceOf[Lines]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Lines] (val x: Self) extends AnyVal {
      
      inline def setBoundingBox(value: String): Self = StObject.set(x, "boundingBox", value.asInstanceOf[js.Any])
      
      inline def setLines(value: js.Array[Words]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setLinesVarargs(value: Words*): Self = StObject.set(x, "lines", js.Array(value*))
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var score: Double
  }
  object Name {
    
    inline def apply(name: String, score: Double): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    }
  }
  
  trait PersonId extends StObject {
    
    var personId: String
  }
  object PersonId {
    
    inline def apply(personId: String): PersonId = {
      val __obj = js.Dynamic.literal(personId = personId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PersonId]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PersonId] (val x: Self) extends AnyVal {
      
      inline def setPersonId(value: String): Self = StObject.set(x, "personId", value.asInstanceOf[js.Any])
    }
  }
  
  trait Pitch extends StObject {
    
    var pitch: Double
    
    var roll: Double
    
    var yaw: Double
  }
  object Pitch {
    
    inline def apply(pitch: Double, roll: Double, yaw: Double): Pitch = {
      val __obj = js.Dynamic.literal(pitch = pitch.asInstanceOf[js.Any], roll = roll.asInstanceOf[js.Any], yaw = yaw.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pitch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Pitch] (val x: Self) extends AnyVal {
      
      inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
      
      inline def setRoll(value: Double): Self = StObject.set(x, "roll", value.asInstanceOf[js.Any])
      
      inline def setYaw(value: Double): Self = StObject.set(x, "yaw", value.asInstanceOf[js.Any])
    }
  }
  
  trait Words extends StObject {
    
    var boundingBox: String
    
    var words: js.Array[BoundingBox]
  }
  object Words {
    
    inline def apply(boundingBox: String, words: js.Array[BoundingBox]): Words = {
      val __obj = js.Dynamic.literal(boundingBox = boundingBox.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
      __obj.asInstanceOf[Words]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Words] (val x: Self) extends AnyVal {
      
      inline def setBoundingBox(value: String): Self = StObject.set(x, "boundingBox", value.asInstanceOf[js.Any])
      
      inline def setWords(value: js.Array[BoundingBox]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
      
      inline def setWordsVarargs(value: BoundingBox*): Self = StObject.set(x, "words", js.Array(value*))
    }
  }
}
