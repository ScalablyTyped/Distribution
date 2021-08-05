package typings.reactEasyCrop

import typings.reactEasyCrop.anon.Crop
import typings.reactEasyCrop.anon.CroppedAreaPercentages
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
  
  inline def classNames(args: (js.UndefOr[Boolean | String | Double | Unit | Null])*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(args.asInstanceOf[js.Any]).asInstanceOf[String]
  
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
  
  inline def getInitialCropFromCroppedAreaPixels(croppedAreaPixels: Area, mediaSize: MediaSize): Crop = (^.asInstanceOf[js.Dynamic].applyDynamic("getInitialCropFromCroppedAreaPixels")(croppedAreaPixels.asInstanceOf[js.Any], mediaSize.asInstanceOf[js.Any])).asInstanceOf[Crop]
  inline def getInitialCropFromCroppedAreaPixels(croppedAreaPixels: Area, mediaSize: MediaSize, cropSize: Size): Crop = (^.asInstanceOf[js.Dynamic].applyDynamic("getInitialCropFromCroppedAreaPixels")(croppedAreaPixels.asInstanceOf[js.Any], mediaSize.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any])).asInstanceOf[Crop]
  
  inline def getRotationBetweenPoints(pointA: Point, pointB: Point): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getRotationBetweenPoints")(pointA.asInstanceOf[js.Any], pointB.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def restrictPosition(position: Point, mediaSize: Size, cropSize: Size, zoom: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("restrictPosition")(position.asInstanceOf[js.Any], mediaSize.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any])).asInstanceOf[Point]
  inline def restrictPosition(position: Point, mediaSize: Size, cropSize: Size, zoom: Double, rotation: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("restrictPosition")(position.asInstanceOf[js.Any], mediaSize.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any])).asInstanceOf[Point]
  
  inline def rotateAroundMidPoint(x: Double, y: Double, xMid: Double, yMid: Double, degrees: Double): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateAroundMidPoint")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], xMid.asInstanceOf[js.Any], yMid.asInstanceOf[js.Any], degrees.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def translateSize(width: Double, height: Double, rotation: Double): Size = (^.asInstanceOf[js.Dynamic].applyDynamic("translateSize")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any])).asInstanceOf[Size]
}
