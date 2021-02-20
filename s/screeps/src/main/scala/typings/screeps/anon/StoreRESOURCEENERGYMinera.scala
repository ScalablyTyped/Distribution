package typings.screeps.anon

import typings.screeps.ResourceConstant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined screeps.Store<screeps.RESOURCE_ENERGY | screeps.MineralConstant | screeps.MineralCompoundConstant, false> */
@js.native
trait StoreRESOURCEENERGYMinera extends StObject {
  
  var G: Double = js.native
  
  var GH: Double = js.native
  
  var GH2O: Double = js.native
  
  var GHO2: Double = js.native
  
  var GO: Double = js.native
  
  var H: Double = js.native
  
  var K: Double = js.native
  
  var KH: Double = js.native
  
  var KH2O: Double = js.native
  
  var KHO2: Double = js.native
  
  var KO: Double = js.native
  
  var L: Double = js.native
  
  var LH: Double = js.native
  
  var LH2O: Double = js.native
  
  var LHO2: Double = js.native
  
  var LO: Double = js.native
  
  var O: Double = js.native
  
  var OH: Double = js.native
  
  var U: Double = js.native
  
  var UH: Double = js.native
  
  var UH2O: Double = js.native
  
  var UHO2: Double = js.native
  
  var UL: Double = js.native
  
  var UO: Double = js.native
  
  var X: Double = js.native
  
  var XGH2O: Double = js.native
  
  var XGHO2: Double = js.native
  
  var XKH2O: Double = js.native
  
  var XKHO2: Double = js.native
  
  var XLH2O: Double = js.native
  
  var XLHO2: Double = js.native
  
  var XUH2O: Double = js.native
  
  var XUHO2: Double = js.native
  
  var XZH2O: Double = js.native
  
  var XZHO2: Double = js.native
  
  var Z: Double = js.native
  
  var ZH: Double = js.native
  
  var ZH2O: Double = js.native
  
  var ZHO2: Double = js.native
  
  var ZK: Double = js.native
  
  var ZO: Double = js.native
  
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
  
  var power: typings.screeps.screepsNumbers.`0` = js.native
  
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
