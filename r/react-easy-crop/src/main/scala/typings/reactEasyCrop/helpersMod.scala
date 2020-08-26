package typings.reactEasyCrop

import typings.reactEasyCrop.anon.Crop
import typings.reactEasyCrop.anon.CroppedAreaPercentages
import typings.reactEasyCrop.typesMod.Area
import typings.reactEasyCrop.typesMod.MediaSize
import typings.reactEasyCrop.typesMod.Point
import typings.reactEasyCrop.typesMod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-easy-crop/helpers", JSImport.Namespace)
@js.native
object helpersMod extends js.Object {
  def classNames(args: (js.UndefOr[Boolean | String | Double | Unit | Null])*): String = js.native
  def computeCroppedArea(crop: Point, mediaSize: MediaSize, cropSize: Size, aspect: Double, zoom: Double): CroppedAreaPercentages = js.native
  def computeCroppedArea(
    crop: Point,
    mediaSize: MediaSize,
    cropSize: Size,
    aspect: Double,
    zoom: Double,
    rotation: js.UndefOr[scala.Nothing],
    restrictPosition: Boolean
  ): CroppedAreaPercentages = js.native
  def computeCroppedArea(crop: Point, mediaSize: MediaSize, cropSize: Size, aspect: Double, zoom: Double, rotation: Double): CroppedAreaPercentages = js.native
  def computeCroppedArea(
    crop: Point,
    mediaSize: MediaSize,
    cropSize: Size,
    aspect: Double,
    zoom: Double,
    rotation: Double,
    restrictPosition: Boolean
  ): CroppedAreaPercentages = js.native
  def getCenter(a: Point, b: Point): Point = js.native
  def getCropSize(
    mediaWidth: Double,
    mediaHeight: Double,
    containerWidth: Double,
    containerHeight: Double,
    aspect: Double
  ): Size = js.native
  def getCropSize(
    mediaWidth: Double,
    mediaHeight: Double,
    containerWidth: Double,
    containerHeight: Double,
    aspect: Double,
    rotation: Double
  ): Size = js.native
  def getDistanceBetweenPoints(pointA: Point, pointB: Point): Double = js.native
  def getInitialCropFromCroppedAreaPixels(croppedAreaPixels: Area, mediaSize: MediaSize): Crop = js.native
  def getInitialCropFromCroppedAreaPixels(croppedAreaPixels: Area, mediaSize: MediaSize, cropSize: Size): Crop = js.native
  def getRotationBetweenPoints(pointA: Point, pointB: Point): Double = js.native
  def restrictPosition(position: Point, mediaSize: Size, cropSize: Size, zoom: Double): Point = js.native
  def restrictPosition(position: Point, mediaSize: Size, cropSize: Size, zoom: Double, rotation: Double): Point = js.native
  def rotateAroundMidPoint(x: Double, y: Double, xMid: Double, yMid: Double, degrees: Double): js.Tuple2[Double, Double] = js.native
  def translateSize(width: Double, height: Double, rotation: Double): Size = js.native
}

