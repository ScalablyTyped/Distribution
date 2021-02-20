package typings.projectOxford

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AccentColor extends StObject {
    
    var accentColor: String = js.native
    
    var dominantColorBackground: String = js.native
    
    var dominantColorForeground: String = js.native
    
    var dominantColors: js.Array[String] = js.native
    
    var isBWImg: Boolean = js.native
  }
  object AccentColor {
    
    @scala.inline
    def apply(
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
    implicit class AccentColorMutableBuilder[Self <: AccentColor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccentColor(value: String): Self = StObject.set(x, "accentColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDominantColorBackground(value: String): Self = StObject.set(x, "dominantColorBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDominantColorForeground(value: String): Self = StObject.set(x, "dominantColorForeground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDominantColors(value: js.Array[String]): Self = StObject.set(x, "dominantColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDominantColorsVarargs(value: String*): Self = StObject.set(x, "dominantColors", js.Array(value :_*))
      
      @scala.inline
      def setIsBWImg(value: Boolean): Self = StObject.set(x, "isBWImg", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AdultScore extends StObject {
    
    var adultScore: Double = js.native
    
    var isAdultContent: Boolean = js.native
    
    var isRacyContent: Boolean = js.native
    
    var racyScore: Double = js.native
  }
  object AdultScore {
    
    @scala.inline
    def apply(adultScore: Double, isAdultContent: Boolean, isRacyContent: Boolean, racyScore: Double): AdultScore = {
      val __obj = js.Dynamic.literal(adultScore = adultScore.asInstanceOf[js.Any], isAdultContent = isAdultContent.asInstanceOf[js.Any], isRacyContent = isRacyContent.asInstanceOf[js.Any], racyScore = racyScore.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdultScore]
    }
    
    @scala.inline
    implicit class AdultScoreMutableBuilder[Self <: AdultScore] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdultScore(value: Double): Self = StObject.set(x, "adultScore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAdultContent(value: Boolean): Self = StObject.set(x, "isAdultContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRacyContent(value: Boolean): Self = StObject.set(x, "isRacyContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRacyScore(value: Double): Self = StObject.set(x, "racyScore", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Age extends StObject {
    
    var age: Double = js.native
    
    var faceRectangle: Height = js.native
    
    var gender: String = js.native
  }
  object Age {
    
    @scala.inline
    def apply(age: Double, faceRectangle: Height, gender: String): Age = {
      val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], faceRectangle = faceRectangle.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any])
      __obj.asInstanceOf[Age]
    }
    
    @scala.inline
    implicit class AgeMutableBuilder[Self <: Age] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAge(value: Double): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFaceRectangle(value: Height): Self = StObject.set(x, "faceRectangle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BoundingBox extends StObject {
    
    var boundingBox: String = js.native
    
    var text: String = js.native
  }
  object BoundingBox {
    
    @scala.inline
    def apply(boundingBox: String, text: String): BoundingBox = {
      val __obj = js.Dynamic.literal(boundingBox = boundingBox.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoundingBox]
    }
    
    @scala.inline
    implicit class BoundingBoxMutableBuilder[Self <: BoundingBox] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoundingBox(value: String): Self = StObject.set(x, "boundingBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ClipArtType extends StObject {
    
    var clipArtType: Double = js.native
    
    var lineDrawingType: Double = js.native
  }
  object ClipArtType {
    
    @scala.inline
    def apply(clipArtType: Double, lineDrawingType: Double): ClipArtType = {
      val __obj = js.Dynamic.literal(clipArtType = clipArtType.asInstanceOf[js.Any], lineDrawingType = lineDrawingType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClipArtType]
    }
    
    @scala.inline
    implicit class ClipArtTypeMutableBuilder[Self <: ClipArtType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClipArtType(value: Double): Self = StObject.set(x, "clipArtType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineDrawingType(value: Double): Self = StObject.set(x, "lineDrawingType", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Confidence extends StObject {
    
    var confidence: Double = js.native
    
    var personId: String = js.native
  }
  object Confidence {
    
    @scala.inline
    def apply(confidence: Double, personId: String): Confidence = {
      val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], personId = personId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Confidence]
    }
    
    @scala.inline
    implicit class ConfidenceMutableBuilder[Self <: Confidence] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersonId(value: String): Self = StObject.set(x, "personId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Format extends StObject {
    
    var format: String = js.native
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object Format {
    
    @scala.inline
    def apply(format: String, height: Double, width: Double): Format = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Format]
    }
    
    @scala.inline
    implicit class FormatMutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Height extends StObject {
    
    var height: Double = js.native
    
    var left: Double = js.native
    
    var top: Double = js.native
    
    var width: Double = js.native
  }
  object Height {
    
    @scala.inline
    def apply(height: Double, left: Double, top: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Lines extends StObject {
    
    var boundingBox: String = js.native
    
    var lines: js.Array[Words] = js.native
  }
  object Lines {
    
    @scala.inline
    def apply(boundingBox: String, lines: js.Array[Words]): Lines = {
      val __obj = js.Dynamic.literal(boundingBox = boundingBox.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any])
      __obj.asInstanceOf[Lines]
    }
    
    @scala.inline
    implicit class LinesMutableBuilder[Self <: Lines] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoundingBox(value: String): Self = StObject.set(x, "boundingBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLines(value: js.Array[Words]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinesVarargs(value: Words*): Self = StObject.set(x, "lines", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Name extends StObject {
    
    var name: String = js.native
    
    var score: Double = js.native
  }
  object Name {
    
    @scala.inline
    def apply(name: String, score: Double): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PersonId extends StObject {
    
    var personId: String = js.native
  }
  object PersonId {
    
    @scala.inline
    def apply(personId: String): PersonId = {
      val __obj = js.Dynamic.literal(personId = personId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PersonId]
    }
    
    @scala.inline
    implicit class PersonIdMutableBuilder[Self <: PersonId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPersonId(value: String): Self = StObject.set(x, "personId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Pitch extends StObject {
    
    var pitch: Double = js.native
    
    var roll: Double = js.native
    
    var yaw: Double = js.native
  }
  object Pitch {
    
    @scala.inline
    def apply(pitch: Double, roll: Double, yaw: Double): Pitch = {
      val __obj = js.Dynamic.literal(pitch = pitch.asInstanceOf[js.Any], roll = roll.asInstanceOf[js.Any], yaw = yaw.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pitch]
    }
    
    @scala.inline
    implicit class PitchMutableBuilder[Self <: Pitch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoll(value: Double): Self = StObject.set(x, "roll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYaw(value: Double): Self = StObject.set(x, "yaw", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Words extends StObject {
    
    var boundingBox: String = js.native
    
    var words: js.Array[BoundingBox] = js.native
  }
  object Words {
    
    @scala.inline
    def apply(boundingBox: String, words: js.Array[BoundingBox]): Words = {
      val __obj = js.Dynamic.literal(boundingBox = boundingBox.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
      __obj.asInstanceOf[Words]
    }
    
    @scala.inline
    implicit class WordsMutableBuilder[Self <: Words] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoundingBox(value: String): Self = StObject.set(x, "boundingBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWords(value: js.Array[BoundingBox]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordsVarargs(value: BoundingBox*): Self = StObject.set(x, "words", js.Array(value :_*))
    }
  }
}
