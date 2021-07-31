package typings.projectOxford.mod

import typings.projectOxford.anon.Confidence
import typings.projectOxford.anon.Pitch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FaceResponses {
  
  trait Attributes extends StObject {
    
    var age: Double
    
    var gender: String
    
    var headPose: Pitch
  }
  object Attributes {
    
    @scala.inline
    def apply(age: Double, gender: String, headPose: Pitch): Attributes = {
      val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], headPose = headPose.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attributes]
    }
    
    @scala.inline
    implicit class AttributesMutableBuilder[Self <: Attributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAge(value: Double): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadPose(value: Pitch): Self = StObject.set(x, "headPose", value.asInstanceOf[js.Any])
    }
  }
  
  trait Detect extends StObject {
    
    var attributes: Attributes
    
    var faceId: String
    
    var faceLandmarks: FaceLandmarks
    
    var faceRectangle: FaceRectangle
  }
  object Detect {
    
    @scala.inline
    def apply(attributes: Attributes, faceId: String, faceLandmarks: FaceLandmarks, faceRectangle: FaceRectangle): Detect = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], faceId = faceId.asInstanceOf[js.Any], faceLandmarks = faceLandmarks.asInstanceOf[js.Any], faceRectangle = faceRectangle.asInstanceOf[js.Any])
      __obj.asInstanceOf[Detect]
    }
    
    @scala.inline
    implicit class DetectMutableBuilder[Self <: Detect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFaceId(value: String): Self = StObject.set(x, "faceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFaceLandmarks(value: FaceLandmarks): Self = StObject.set(x, "faceLandmarks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFaceRectangle(value: FaceRectangle): Self = StObject.set(x, "faceRectangle", value.asInstanceOf[js.Any])
    }
  }
  
  trait FaceLandmarks extends StObject {
    
    var eyeLeftBottom: point
    
    var eyeLeftInner: point
    
    var eyeLeftOuter: point
    
    var eyeLeftTop: point
    
    var eyeRightBottom: point
    
    var eyeRightInner: point
    
    var eyeRightOuter: point
    
    var eyeRightTop: point
    
    var eyebrowLeftInner: point
    
    var eyebrowLeftOuter: point
    
    var eyebrowRightInner: point
    
    var eyebrowRightOuter: point
    
    var mouthLeft: point
    
    var mouthRight: point
    
    var noseLeftAlarOutTip: point
    
    var noseLeftAlarTop: point
    
    var noseRightAlarOutTip: point
    
    var noseRightAlarTop: point
    
    var noseRootLeft: point
    
    var noseRootRight: point
    
    var noseTip: point
    
    var pupilLeft: point
    
    var pupilRight: point
    
    var underLipBottom: point
    
    var underLipTop: point
    
    var upperLipBottom: point
    
    var upperLipTop: point
  }
  object FaceLandmarks {
    
    @scala.inline
    def apply(
      eyeLeftBottom: point,
      eyeLeftInner: point,
      eyeLeftOuter: point,
      eyeLeftTop: point,
      eyeRightBottom: point,
      eyeRightInner: point,
      eyeRightOuter: point,
      eyeRightTop: point,
      eyebrowLeftInner: point,
      eyebrowLeftOuter: point,
      eyebrowRightInner: point,
      eyebrowRightOuter: point,
      mouthLeft: point,
      mouthRight: point,
      noseLeftAlarOutTip: point,
      noseLeftAlarTop: point,
      noseRightAlarOutTip: point,
      noseRightAlarTop: point,
      noseRootLeft: point,
      noseRootRight: point,
      noseTip: point,
      pupilLeft: point,
      pupilRight: point,
      underLipBottom: point,
      underLipTop: point,
      upperLipBottom: point,
      upperLipTop: point
    ): FaceLandmarks = {
      val __obj = js.Dynamic.literal(eyeLeftBottom = eyeLeftBottom.asInstanceOf[js.Any], eyeLeftInner = eyeLeftInner.asInstanceOf[js.Any], eyeLeftOuter = eyeLeftOuter.asInstanceOf[js.Any], eyeLeftTop = eyeLeftTop.asInstanceOf[js.Any], eyeRightBottom = eyeRightBottom.asInstanceOf[js.Any], eyeRightInner = eyeRightInner.asInstanceOf[js.Any], eyeRightOuter = eyeRightOuter.asInstanceOf[js.Any], eyeRightTop = eyeRightTop.asInstanceOf[js.Any], eyebrowLeftInner = eyebrowLeftInner.asInstanceOf[js.Any], eyebrowLeftOuter = eyebrowLeftOuter.asInstanceOf[js.Any], eyebrowRightInner = eyebrowRightInner.asInstanceOf[js.Any], eyebrowRightOuter = eyebrowRightOuter.asInstanceOf[js.Any], mouthLeft = mouthLeft.asInstanceOf[js.Any], mouthRight = mouthRight.asInstanceOf[js.Any], noseLeftAlarOutTip = noseLeftAlarOutTip.asInstanceOf[js.Any], noseLeftAlarTop = noseLeftAlarTop.asInstanceOf[js.Any], noseRightAlarOutTip = noseRightAlarOutTip.asInstanceOf[js.Any], noseRightAlarTop = noseRightAlarTop.asInstanceOf[js.Any], noseRootLeft = noseRootLeft.asInstanceOf[js.Any], noseRootRight = noseRootRight.asInstanceOf[js.Any], noseTip = noseTip.asInstanceOf[js.Any], pupilLeft = pupilLeft.asInstanceOf[js.Any], pupilRight = pupilRight.asInstanceOf[js.Any], underLipBottom = underLipBottom.asInstanceOf[js.Any], underLipTop = underLipTop.asInstanceOf[js.Any], upperLipBottom = upperLipBottom.asInstanceOf[js.Any], upperLipTop = upperLipTop.asInstanceOf[js.Any])
      __obj.asInstanceOf[FaceLandmarks]
    }
    
    @scala.inline
    implicit class FaceLandmarksMutableBuilder[Self <: FaceLandmarks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEyeLeftBottom(value: point): Self = StObject.set(x, "eyeLeftBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEyeLeftInner(value: point): Self = StObject.set(x, "eyeLeftInner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEyeLeftOuter(value: point): Self = StObject.set(x, "eyeLeftOuter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEyeLeftTop(value: point): Self = StObject.set(x, "eyeLeftTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEyeRightBottom(value: point): Self = StObject.set(x, "eyeRightBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEyeRightInner(value: point): Self = StObject.set(x, "eyeRightInner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEyeRightOuter(value: point): Self = StObject.set(x, "eyeRightOuter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEyeRightTop(value: point): Self = StObject.set(x, "eyeRightTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEyebrowLeftInner(value: point): Self = StObject.set(x, "eyebrowLeftInner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEyebrowLeftOuter(value: point): Self = StObject.set(x, "eyebrowLeftOuter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEyebrowRightInner(value: point): Self = StObject.set(x, "eyebrowRightInner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEyebrowRightOuter(value: point): Self = StObject.set(x, "eyebrowRightOuter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouthLeft(value: point): Self = StObject.set(x, "mouthLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouthRight(value: point): Self = StObject.set(x, "mouthRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoseLeftAlarOutTip(value: point): Self = StObject.set(x, "noseLeftAlarOutTip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoseLeftAlarTop(value: point): Self = StObject.set(x, "noseLeftAlarTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoseRightAlarOutTip(value: point): Self = StObject.set(x, "noseRightAlarOutTip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoseRightAlarTop(value: point): Self = StObject.set(x, "noseRightAlarTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoseRootLeft(value: point): Self = StObject.set(x, "noseRootLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoseRootRight(value: point): Self = StObject.set(x, "noseRootRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoseTip(value: point): Self = StObject.set(x, "noseTip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPupilLeft(value: point): Self = StObject.set(x, "pupilLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPupilRight(value: point): Self = StObject.set(x, "pupilRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderLipBottom(value: point): Self = StObject.set(x, "underLipBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderLipTop(value: point): Self = StObject.set(x, "underLipTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpperLipBottom(value: point): Self = StObject.set(x, "upperLipBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpperLipTop(value: point): Self = StObject.set(x, "upperLipTop", value.asInstanceOf[js.Any])
    }
  }
  
  trait FaceRectangle extends StObject {
    
    var height: Double
    
    var left: Double
    
    var top: Double
    
    var width: Double
  }
  object FaceRectangle {
    
    @scala.inline
    def apply(height: Double, left: Double, top: Double, width: Double): FaceRectangle = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[FaceRectangle]
    }
    
    @scala.inline
    implicit class FaceRectangleMutableBuilder[Self <: FaceRectangle] (val x: Self) extends AnyVal {
      
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
  
  trait Grouping extends StObject {
    
    var groups: js.Array[String]
    
    var messyGroup: js.Array[String]
  }
  object Grouping {
    
    @scala.inline
    def apply(groups: js.Array[String], messyGroup: js.Array[String]): Grouping = {
      val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], messyGroup = messyGroup.asInstanceOf[js.Any])
      __obj.asInstanceOf[Grouping]
    }
    
    @scala.inline
    implicit class GroupingMutableBuilder[Self <: Grouping] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
      
      @scala.inline
      def setMessyGroup(value: js.Array[String]): Self = StObject.set(x, "messyGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessyGroupVarargs(value: String*): Self = StObject.set(x, "messyGroup", js.Array(value :_*))
    }
  }
  
  trait Identify extends StObject {
    
    var candidates: js.Array[Confidence]
    
    var faceId: String
  }
  object Identify {
    
    @scala.inline
    def apply(candidates: js.Array[Confidence], faceId: String): Identify = {
      val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any], faceId = faceId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Identify]
    }
    
    @scala.inline
    implicit class IdentifyMutableBuilder[Self <: Identify] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCandidates(value: js.Array[Confidence]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCandidatesVarargs(value: Confidence*): Self = StObject.set(x, "candidates", js.Array(value :_*))
      
      @scala.inline
      def setFaceId(value: String): Self = StObject.set(x, "faceId", value.asInstanceOf[js.Any])
    }
  }
  
  trait Similar extends StObject {
    
    var faceIds: js.Array[String]
  }
  object Similar {
    
    @scala.inline
    def apply(faceIds: js.Array[String]): Similar = {
      val __obj = js.Dynamic.literal(faceIds = faceIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[Similar]
    }
    
    @scala.inline
    implicit class SimilarMutableBuilder[Self <: Similar] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFaceIds(value: js.Array[String]): Self = StObject.set(x, "faceIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFaceIdsVarargs(value: String*): Self = StObject.set(x, "faceIds", js.Array(value :_*))
    }
  }
  
  trait Verify extends StObject {
    
    var confidence: Double
    
    var isIdentical: Boolean
  }
  object Verify {
    
    @scala.inline
    def apply(confidence: Double, isIdentical: Boolean): Verify = {
      val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], isIdentical = isIdentical.asInstanceOf[js.Any])
      __obj.asInstanceOf[Verify]
    }
    
    @scala.inline
    implicit class VerifyMutableBuilder[Self <: Verify] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIdentical(value: Boolean): Self = StObject.set(x, "isIdentical", value.asInstanceOf[js.Any])
    }
  }
  
  trait point extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object point {
    
    @scala.inline
    def apply(x: Double, y: Double): point = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[point]
    }
    
    @scala.inline
    implicit class pointMutableBuilder[Self <: point] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
