package typings.screeps.anon

import typings.screeps.ResourceConstant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined screeps.Store<screeps.RESOURCE_ENERGY | screeps.RESOURCE_POWER, false> */
@js.native
trait StoreRESOURCEENERGYRESOUR extends StObject {
  
  var G: typings.screeps.screepsNumbers.`0` = js.native
  
  var GH: typings.screeps.screepsNumbers.`0` = js.native
  
  var GH2O: typings.screeps.screepsNumbers.`0` = js.native
  
  var GHO2: typings.screeps.screepsNumbers.`0` = js.native
  
  var GO: typings.screeps.screepsNumbers.`0` = js.native
  
  var H: typings.screeps.screepsNumbers.`0` = js.native
  
  var K: typings.screeps.screepsNumbers.`0` = js.native
  
  var KH: typings.screeps.screepsNumbers.`0` = js.native
  
  var KH2O: typings.screeps.screepsNumbers.`0` = js.native
  
  var KHO2: typings.screeps.screepsNumbers.`0` = js.native
  
  var KO: typings.screeps.screepsNumbers.`0` = js.native
  
  var L: typings.screeps.screepsNumbers.`0` = js.native
  
  var LH: typings.screeps.screepsNumbers.`0` = js.native
  
  var LH2O: typings.screeps.screepsNumbers.`0` = js.native
  
  var LHO2: typings.screeps.screepsNumbers.`0` = js.native
  
  var LO: typings.screeps.screepsNumbers.`0` = js.native
  
  var O: typings.screeps.screepsNumbers.`0` = js.native
  
  var OH: typings.screeps.screepsNumbers.`0` = js.native
  
  var U: typings.screeps.screepsNumbers.`0` = js.native
  
  var UH: typings.screeps.screepsNumbers.`0` = js.native
  
  var UH2O: typings.screeps.screepsNumbers.`0` = js.native
  
  var UHO2: typings.screeps.screepsNumbers.`0` = js.native
  
  var UL: typings.screeps.screepsNumbers.`0` = js.native
  
  var UO: typings.screeps.screepsNumbers.`0` = js.native
  
  var X: typings.screeps.screepsNumbers.`0` = js.native
  
  var XGH2O: typings.screeps.screepsNumbers.`0` = js.native
  
  var XGHO2: typings.screeps.screepsNumbers.`0` = js.native
  
  var XKH2O: typings.screeps.screepsNumbers.`0` = js.native
  
  var XKHO2: typings.screeps.screepsNumbers.`0` = js.native
  
  var XLH2O: typings.screeps.screepsNumbers.`0` = js.native
  
  var XLHO2: typings.screeps.screepsNumbers.`0` = js.native
  
  var XUH2O: typings.screeps.screepsNumbers.`0` = js.native
  
  var XUHO2: typings.screeps.screepsNumbers.`0` = js.native
  
  var XZH2O: typings.screeps.screepsNumbers.`0` = js.native
  
  var XZHO2: typings.screeps.screepsNumbers.`0` = js.native
  
  var Z: typings.screeps.screepsNumbers.`0` = js.native
  
  var ZH: typings.screeps.screepsNumbers.`0` = js.native
  
  var ZH2O: typings.screeps.screepsNumbers.`0` = js.native
  
  var ZHO2: typings.screeps.screepsNumbers.`0` = js.native
  
  var ZK: typings.screeps.screepsNumbers.`0` = js.native
  
  var ZO: typings.screeps.screepsNumbers.`0` = js.native
  
  var alloy: typings.screeps.screepsNumbers.`0` = js.native
  
  var battery: typings.screeps.screepsNumbers.`0` = js.native
  
  var biomass: typings.screeps.screepsNumbers.`0` = js.native
  
  var cell: typings.screeps.screepsNumbers.`0` = js.native
  
  var circuit: typings.screeps.screepsNumbers.`0` = js.native
  
  var composite: typings.screeps.screepsNumbers.`0` = js.native
  
  var concentrate: typings.screeps.screepsNumbers.`0` = js.native
  
  var condensate: typings.screeps.screepsNumbers.`0` = js.native
  
  var crystal: typings.screeps.screepsNumbers.`0` = js.native
  
  var device: typings.screeps.screepsNumbers.`0` = js.native
  
  var emanation: typings.screeps.screepsNumbers.`0` = js.native
  
  var energy: Double = js.native
  
  var essence: typings.screeps.screepsNumbers.`0` = js.native
  
  var extract: typings.screeps.screepsNumbers.`0` = js.native
  
  var fixtures: typings.screeps.screepsNumbers.`0` = js.native
  
  var frame: typings.screeps.screepsNumbers.`0` = js.native
  
  /**
    * Returns capacity of this store for the specified resource. For a general purpose store, it returns total capacity if `resource` is undefined.
    * @param resource The type of the resource.
    * @returns Returns capacity number, or `null` in case of an invalid `resource` for this store type.
    */
  def getCapacity[R /* <: js.UndefOr[ResourceConstant] */](): Null | Double = js.native
  def getCapacity[R /* <: js.UndefOr[ResourceConstant] */](resource: R): Null | Double = js.native
  
  /**
    * Returns free capacity for the store. For a limited store, it returns the capacity available for the specified resource if `resource` is defined and valid for this store.
    * @param resource The type of the resource.
    * @returns Returns available capacity number, or `null` in case of an invalid `resource` for this store type.
    */
  def getFreeCapacity[R /* <: js.UndefOr[ResourceConstant] */](): Null | Double = js.native
  def getFreeCapacity[R /* <: js.UndefOr[ResourceConstant] */](resource: R): Null | Double = js.native
  
  /**
    * Returns the capacity used by the specified resource, or total used capacity for general purpose stores if `resource` is undefined.
    * @param resource The type of the resource.
    * @returns Returns used capacity number, or `null` in case of a not valid `resource` for this store type.
    */
  def getUsedCapacity[R /* <: js.UndefOr[ResourceConstant] */](): Null | Double = js.native
  def getUsedCapacity[R /* <: js.UndefOr[ResourceConstant] */](resource: R): Null | Double = js.native
  
  var ghodium_melt: typings.screeps.screepsNumbers.`0` = js.native
  
  var hydraulics: typings.screeps.screepsNumbers.`0` = js.native
  
  var keanium_bar: typings.screeps.screepsNumbers.`0` = js.native
  
  var lemergium_bar: typings.screeps.screepsNumbers.`0` = js.native
  
  var liquid: typings.screeps.screepsNumbers.`0` = js.native
  
  var machine: typings.screeps.screepsNumbers.`0` = js.native
  
  var metal: typings.screeps.screepsNumbers.`0` = js.native
  
  var microchip: typings.screeps.screepsNumbers.`0` = js.native
  
  var mist: typings.screeps.screepsNumbers.`0` = js.native
  
  var muscle: typings.screeps.screepsNumbers.`0` = js.native
  
  var ops: typings.screeps.screepsNumbers.`0` = js.native
  
  var organism: typings.screeps.screepsNumbers.`0` = js.native
  
  var organoid: typings.screeps.screepsNumbers.`0` = js.native
  
  var oxidant: typings.screeps.screepsNumbers.`0` = js.native
  
  var phlegm: typings.screeps.screepsNumbers.`0` = js.native
  
  var power: Double = js.native
  
  var purifier: typings.screeps.screepsNumbers.`0` = js.native
  
  var reductant: typings.screeps.screepsNumbers.`0` = js.native
  
  var silicon: typings.screeps.screepsNumbers.`0` = js.native
  
  var spirit: typings.screeps.screepsNumbers.`0` = js.native
  
  var switch: typings.screeps.screepsNumbers.`0` = js.native
  
  var tissue: typings.screeps.screepsNumbers.`0` = js.native
  
  var transistor: typings.screeps.screepsNumbers.`0` = js.native
  
  var tube: typings.screeps.screepsNumbers.`0` = js.native
  
  var utrium_bar: typings.screeps.screepsNumbers.`0` = js.native
  
  var wire: typings.screeps.screepsNumbers.`0` = js.native
  
  var zynthium_bar: typings.screeps.screepsNumbers.`0` = js.native
}
