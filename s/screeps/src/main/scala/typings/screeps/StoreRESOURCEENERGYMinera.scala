package typings.screeps

import typings.screeps.screepsNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined screeps.Store<screeps.RESOURCE_ENERGY | screeps.MineralConstant | screeps.MineralCompoundConstant, false> */
@js.native
trait StoreRESOURCEENERGYMinera extends js.Object {
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
  /** Returns capacity of this store for the specified resource, or total capacity if resource is undefined. */
  def getCapacity[R /* <: js.UndefOr[ResourceConstant] */](): Null | Double = js.native
  def getCapacity[R /* <: js.UndefOr[ResourceConstant] */](resource: R): Null | Double = js.native
  /** A shorthand for getCapacity(resource) - getUsedCapacity(resource). */
  def getFreeCapacity(): Double = js.native
  def getFreeCapacity(resource: ResourceConstant): Double = js.native
  /** Returns the capacity used by the specified resource, or total used capacity for general purpose stores if resource is undefined. */
  def getUsedCapacity[R /* <: js.UndefOr[ResourceConstant] */](): `0` | Double | Null = js.native
  def getUsedCapacity[R /* <: js.UndefOr[ResourceConstant] */](resource: R): `0` | Double | Null = js.native
}

