package typings.seatsio.Seatsio

import org.scalablytyped.runtime.Instantiable1
import typings.seatsio.anon.Amount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeatingChart extends // tslint:disable-next-line:no-misused-new
Instantiable1[/* config */ SeatingChartConfig, SeatingChart] {
  
  def changeConfig(config: ChangeableSeatingChartConfig): Unit = js.native
  
  def clearSelection(): Unit = js.native
  def clearSelection(successCallback: js.UndefOr[scala.Nothing], failureCallback: js.Function0[Unit]): Unit = js.native
  def clearSelection(successCallback: js.Function0[Unit]): Unit = js.native
  def clearSelection(successCallback: js.Function0[Unit], failureCallback: js.Function0[Unit]): Unit = js.native
  
  var config: SeatingChartConfig = js.native
  
  def deselectCategories(categoryIds: js.Array[String]): Unit = js.native
  def deselectCategories(
    categoryIds: js.Array[String],
    successCallback: js.UndefOr[scala.Nothing],
    failureCallback: js.Function0[Unit]
  ): Unit = js.native
  def deselectCategories(categoryIds: js.Array[String], successCallback: js.Function0[Unit]): Unit = js.native
  def deselectCategories(
    categoryIds: js.Array[String],
    successCallback: js.Function0[Unit],
    failureCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def deselectObjects(objects: js.Array[Amount | String]): Unit = js.native
  def deselectObjects(
    objects: js.Array[Amount | String],
    successCallback: js.UndefOr[scala.Nothing],
    failureCallback: js.Function0[Unit]
  ): Unit = js.native
  def deselectObjects(objects: js.Array[Amount | String], successCallback: js.Function0[Unit]): Unit = js.native
  def deselectObjects(
    objects: js.Array[Amount | String],
    successCallback: js.Function0[Unit],
    failureCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def findObject(label: String): Unit = js.native
  def findObject(
    label: String,
    successCallback: js.UndefOr[scala.Nothing],
    objectNotFoundCallback: js.Function0[Unit]
  ): Unit = js.native
  def findObject(label: String, successCallback: js.Function1[/* object */ BookableObject, Unit]): Unit = js.native
  def findObject(
    label: String,
    successCallback: js.Function1[/* object */ BookableObject, Unit],
    objectNotFoundCallback: js.Function0[Unit]
  ): Unit = js.native
  
  var holdToken: String | Null = js.native
  
  def listCategories(callback: js.Function1[/* object */ js.Array[Category], Unit]): Unit = js.native
  
  def listSelectedObjects(selectedObjectsCallback: js.Function1[/* selectedObject */ BookableObject, Unit]): Unit = js.native
  
  def render(): SeatingChart = js.native
  
  def rerender(): Unit = js.native
  
  def resetView(): Unit = js.native
  
  def selectBestAvailable(config: BestAvailable): Unit = js.native
  
  def selectCategories(categoryIds: js.Array[String]): Unit = js.native
  def selectCategories(
    categoryIds: js.Array[String],
    successCallback: js.UndefOr[scala.Nothing],
    failureCallback: js.Function0[Unit]
  ): Unit = js.native
  def selectCategories(categoryIds: js.Array[String], successCallback: js.Function0[Unit]): Unit = js.native
  def selectCategories(
    categoryIds: js.Array[String],
    successCallback: js.Function0[Unit],
    failureCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def selectObjects(objects: js.Array[Amount | String]): Unit = js.native
  def selectObjects(
    objects: js.Array[Amount | String],
    successCallback: js.UndefOr[scala.Nothing],
    failureCallback: js.Function0[Unit]
  ): Unit = js.native
  def selectObjects(objects: js.Array[Amount | String], successCallback: js.Function0[Unit]): Unit = js.native
  def selectObjects(
    objects: js.Array[Amount | String],
    successCallback: js.Function0[Unit],
    failureCallback: js.Function0[Unit]
  ): Unit = js.native
  
  var selectedObjects: js.Array[String] = js.native
  
  def startNewSession(): Unit = js.native
  def startNewSession(successCallback: js.UndefOr[scala.Nothing], failureCallback: js.Function0[Unit]): Unit = js.native
  def startNewSession(successCallback: js.Function0[Unit]): Unit = js.native
  def startNewSession(successCallback: js.Function0[Unit], failureCallback: js.Function0[Unit]): Unit = js.native
  
  def zoomToSelectedObjects(): Unit = js.native
}
