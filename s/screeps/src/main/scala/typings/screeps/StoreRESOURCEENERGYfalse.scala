package typings.screeps

import typings.screeps.screepsNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined screeps.Store<screeps.RESOURCE_ENERGY, false> */
@js.native
trait StoreRESOURCEENERGYfalse extends js.Object {
  var G: `0` = js.native
  var GH: `0` = js.native
  var GH2O: `0` = js.native
  var GHO2: `0` = js.native
  var GO: `0` = js.native
  var H: `0` = js.native
  var K: `0` = js.native
  var KH: `0` = js.native
  var KH2O: `0` = js.native
  var KHO2: `0` = js.native
  var KO: `0` = js.native
  var L: `0` = js.native
  var LH: `0` = js.native
  var LH2O: `0` = js.native
  var LHO2: `0` = js.native
  var LO: `0` = js.native
  var O: `0` = js.native
  var OH: `0` = js.native
  var U: `0` = js.native
  var UH: `0` = js.native
  var UH2O: `0` = js.native
  var UHO2: `0` = js.native
  var UL: `0` = js.native
  var UO: `0` = js.native
  var X: `0` = js.native
  var XGH2O: `0` = js.native
  var XGHO2: `0` = js.native
  var XKH2O: `0` = js.native
  var XKHO2: `0` = js.native
  var XLH2O: `0` = js.native
  var XLHO2: `0` = js.native
  var XUH2O: `0` = js.native
  var XUHO2: `0` = js.native
  var XZH2O: `0` = js.native
  var XZHO2: `0` = js.native
  var Z: `0` = js.native
  var ZH: `0` = js.native
  var ZH2O: `0` = js.native
  var ZHO2: `0` = js.native
  var ZK: `0` = js.native
  var ZO: `0` = js.native
  var alloy: `0` = js.native
  var battery: `0` = js.native
  var biomass: `0` = js.native
  var cell: `0` = js.native
  var circuit: `0` = js.native
  var composite: `0` = js.native
  var concentrate: `0` = js.native
  var condensate: `0` = js.native
  var crystal: `0` = js.native
  var device: `0` = js.native
  var emanation: `0` = js.native
  var energy: Double = js.native
  var essence: `0` = js.native
  var extract: `0` = js.native
  var fixtures: `0` = js.native
  var frame: `0` = js.native
  var ghodium_melt: `0` = js.native
  var hydraulics: `0` = js.native
  var keanium_bar: `0` = js.native
  var lemergium_bar: `0` = js.native
  var liquid: `0` = js.native
  var machine: `0` = js.native
  var metal: `0` = js.native
  var microchip: `0` = js.native
  var mist: `0` = js.native
  var muscle: `0` = js.native
  var ops: `0` = js.native
  var organism: `0` = js.native
  var organoid: `0` = js.native
  var oxidant: `0` = js.native
  var phlegm: `0` = js.native
  var power: `0` = js.native
  var purifier: `0` = js.native
  var reductant: `0` = js.native
  var silicon: `0` = js.native
  var spirit: `0` = js.native
  var switch: `0` = js.native
  var tissue: `0` = js.native
  var transistor: `0` = js.native
  var tube: `0` = js.native
  var utrium_bar: `0` = js.native
  var wire: `0` = js.native
  var zynthium_bar: `0` = js.native
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
}

