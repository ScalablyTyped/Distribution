package typings.reactEasyCrop

import typings.reactEasyCrop.anon.Crop
import typings.reactEasyCrop.anon.CroppedAreaPercentages
import typings.reactEasyCrop.typesMod.Area
import typings.reactEasyCrop.typesMod.MediaSize
import typings.reactEasyCrop.typesMod.Point
import typings.reactEasyCrop.typesMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("react-easy-crop/helpers", "classNames")
  @js.native
  def classNames(args: (js.UndefOr[Boolean | String | Double | Unit | Null])*): String = js.native
  
  @JSImport("react-easy-crop/helpers", "computeCroppedArea")
  @js.native
  def computeCroppedArea(crop: Point, mediaSize: MediaSize, cropSize: Size, aspect: Double, zoom: Double): CroppedAreaPercentages = js.native
  @JSImport("react-easy-crop/helpers", "computeCroppedArea")
  @js.native
  def computeCroppedArea(
    crop: Point,
    mediaSize: MediaSize,
    cropSize: Size,
    aspect: Double,
    zoom: Double,
    rotation: js.UndefOr[scala.Nothing],
    restrictPosition: Boolean
  ): CroppedAreaPercentages = js.native
  @JSImport("react-easy-crop/helpers", "computeCroppedArea")
  @js.native
  def computeCroppedArea(crop: Point, mediaSize: MediaSize, cropSize: Size, aspect: Double, zoom: Double, rotation: Double): CroppedAreaPercentages = js.native
  @JSImport("react-easy-crop/helpers", "computeCroppedArea")
  @js.native
  def computeCroppedArea(
    crop: Point,
    mediaSize: MediaSize,
    cropSize: Size,
    aspect: Double,
    zoom: Double,
    rotation: Double,
    restrictPosition: Boolean
  ): CroppedAreaPercentages = js.native
  
  @JSImport("react-easy-crop/helpers", "getCenter")
  @js.native
  def getCenter(a: Point, b: Point): Point = js.native
  
  @JSImport("react-easy-crop/helpers", "getCropSize")
  @js.native
  def getCropSize(
    mediaWidth: Double,
    mediaHeight: Double,
    containerWidth: Double,
    containerHeight: Double,
    aspect: Double
  ): Size = js.native
  @JSImport("react-easy-crop/helpers", "getCropSize")
  @js.native
  def getCropSize(
    mediaWidth: Double,
    mediaHeight: Double,
    containerWidth: Double,
    containerHeight: Double,
    aspect: Double,
    rotation: Double
  ): Size = js.native
  
  @JSImport("react-easy-crop/helpers", "getDistanceBetweenPoints")
  @js.native
  def getDistanceBetweenPoints(pointA: Point, pointB: Point): Double = js.native
  
  @JSImport("react-easy-crop/helpers", "getInitialCropFromCroppedAreaPixels")
  @js.native
  def getInitialCropFromCroppedAreaPixels(croppedAreaPixels: Area, mediaSize: MediaSize): Crop = js.native
  @JSImport("react-easy-crop/helpers", "getInitialCropFromCroppedAreaPixels")
  @js.native
  def getInitialCropFromCroppedAreaPixels(croppedAreaPixels: Area, mediaSize: MediaSize, cropSize: Size): Crop = js.native
  
  @JSImport("react-easy-crop/helpers", "getRotationBetweenPoints")
  @js.native
  def getRotationBetweenPoints(pointA: Point, pointB: Point): Double = js.native
  
  @JSImport("react-easy-crop/helpers", "restrictPosition")
  @js.native
  def restrictPosition(position: Point, mediaSize: Size, cropSize: Size, zoom: Double): Point = js.native
  @JSImport("react-easy-crop/helpers", "restrictPosition")
  @js.native
  def restrictPosition(position: Point, mediaSize: Size, cropSize: Size, zoom: Double, rotation: Double): Point = js.native
  
  @JSImport("react-easy-crop/helpers", "rotateAroundMidPoint")
  @js.native
  def rotateAroundMidPoint(x: Double, y: Double, xMid: Double, yMid: Double, degrees: Double): js.Tuple2[Double, Double] = js.native
  
  @JSImport("react-easy-crop/helpers", "translateSize")
  @js.native
  def translateSize(width: Double, height: Double, rotation: Double): Size = js.native
}
