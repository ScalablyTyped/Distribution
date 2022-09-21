package typings.reactEasyCrop

import typings.reactEasyCrop.anon.Crop
import typings.reactEasyCrop.anon.CroppedAreaPercentages
import typings.reactEasyCrop.anon.Zoom
import typings.reactEasyCrop.typesMod.Area
import typings.reactEasyCrop.typesMod.MediaSize
import typings.reactEasyCrop.typesMod.Point
import typings.reactEasyCrop.typesMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("react-easy-crop/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clamp(value: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def classNames(args: (js.UndefOr[Boolean | String | Double | Unit | Null])*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  inline def computeCroppedArea(crop: Point, mediaSize: MediaSize, cropSize: Size, aspect: Double, zoom: Double): CroppedAreaPercentages = (^.asInstanceOf[js.Dynamic].applyDynamic("computeCroppedArea")(crop.asInstanceOf[js.Any], mediaSize.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any])).asInstanceOf[CroppedAreaPercentages]
  inline def computeCroppedArea(crop: Point, mediaSize: MediaSize, cropSize: Size, aspect: Double, zoom: Double, rotation: Double): CroppedAreaPercentages = (^.asInstanceOf[js.Dynamic].applyDynamic("computeCroppedArea")(crop.asInstanceOf[js.Any], mediaSize.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any])).asInstanceOf[CroppedAreaPercentages]
  inline def computeCroppedArea(
    crop: Point,
    mediaSize: MediaSize,
    cropSize: Size,
    aspect: Double,
    zoom: Double,
    rotation: Double,
    restrictPosition: Boolean
  ): CroppedAreaPercentages = (^.asInstanceOf[js.Dynamic].applyDynamic("computeCroppedArea")(crop.asInstanceOf[js.Any], mediaSize.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], restrictPosition.asInstanceOf[js.Any])).asInstanceOf[CroppedAreaPercentages]
  inline def computeCroppedArea(
    crop: Point,
    mediaSize: MediaSize,
    cropSize: Size,
    aspect: Double,
    zoom: Double,
    rotation: Unit,
    restrictPosition: Boolean
  ): CroppedAreaPercentages = (^.asInstanceOf[js.Dynamic].applyDynamic("computeCroppedArea")(crop.asInstanceOf[js.Any], mediaSize.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], restrictPosition.asInstanceOf[js.Any])).asInstanceOf[CroppedAreaPercentages]
  
  inline def getCenter(a: Point, b: Point): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("getCenter")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Point]
  
  inline def getCropSize(
    mediaWidth: Double,
    mediaHeight: Double,
    containerWidth: Double,
    containerHeight: Double,
    aspect: Double
  ): Size = (^.asInstanceOf[js.Dynamic].applyDynamic("getCropSize")(mediaWidth.asInstanceOf[js.Any], mediaHeight.asInstanceOf[js.Any], containerWidth.asInstanceOf[js.Any], containerHeight.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any])).asInstanceOf[Size]
  inline def getCropSize(
    mediaWidth: Double,
    mediaHeight: Double,
    containerWidth: Double,
    containerHeight: Double,
    aspect: Double,
    rotation: Double
  ): Size = (^.asInstanceOf[js.Dynamic].applyDynamic("getCropSize")(mediaWidth.asInstanceOf[js.Any], mediaHeight.asInstanceOf[js.Any], containerWidth.asInstanceOf[js.Any], containerHeight.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any])).asInstanceOf[Size]
  
  inline def getDistanceBetweenPoints(pointA: Point, pointB: Point): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDistanceBetweenPoints")(pointA.asInstanceOf[js.Any], pointB.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getInitialCropFromCroppedAreaPercentages(
    croppedAreaPercentages: Area,
    mediaSize: MediaSize,
    rotation: Double,
    cropSize: Size,
    minZoom: Double,
    maxZoom: Double
  ): Crop = (^.asInstanceOf[js.Dynamic].applyDynamic("getInitialCropFromCroppedAreaPercentages")(croppedAreaPercentages.asInstanceOf[js.Any], mediaSize.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], minZoom.asInstanceOf[js.Any], maxZoom.asInstanceOf[js.Any])).asInstanceOf[Crop]
  
  inline def getInitialCropFromCroppedAreaPixels(
    croppedAreaPixels: Area,
    mediaSize: MediaSize,
    rotation: Double,
    cropSize: Size,
    minZoom: Double,
    maxZoom: Double
  ): Zoom = (^.asInstanceOf[js.Dynamic].applyDynamic("getInitialCropFromCroppedAreaPixels")(croppedAreaPixels.asInstanceOf[js.Any], mediaSize.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], minZoom.asInstanceOf[js.Any], maxZoom.asInstanceOf[js.Any])).asInstanceOf[Zoom]
  inline def getInitialCropFromCroppedAreaPixels(
    croppedAreaPixels: Area,
    mediaSize: MediaSize,
    rotation: Unit,
    cropSize: Size,
    minZoom: Double,
    maxZoom: Double
  ): Zoom = (^.asInstanceOf[js.Dynamic].applyDynamic("getInitialCropFromCroppedAreaPixels")(croppedAreaPixels.asInstanceOf[js.Any], mediaSize.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], minZoom.asInstanceOf[js.Any], maxZoom.asInstanceOf[js.Any])).asInstanceOf[Zoom]
  
  inline def getMediaZoom(mediaSize: MediaSize): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMediaZoom")(mediaSize.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getRadianAngle(degreeValue: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getRadianAngle")(degreeValue.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getRotationBetweenPoints(pointA: Point, pointB: Point): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getRotationBetweenPoints")(pointA.asInstanceOf[js.Any], pointB.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def restrictPosition(position: Point, mediaSize: Size, cropSize: Size, zoom: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("restrictPosition")(position.asInstanceOf[js.Any], mediaSize.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any])).asInstanceOf[Point]
  inline def restrictPosition(position: Point, mediaSize: Size, cropSize: Size, zoom: Double, rotation: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("restrictPosition")(position.asInstanceOf[js.Any], mediaSize.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any])).asInstanceOf[Point]
  
  inline def rotateSize(width: Double, height: Double, rotation: Double): Size = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateSize")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any])).asInstanceOf[Size]
}
