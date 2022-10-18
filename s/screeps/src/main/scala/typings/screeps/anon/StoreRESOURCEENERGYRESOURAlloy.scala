package typings.screeps.anon

import typings.screeps.ResourceConstant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined screeps.Store<screeps.RESOURCE_ENERGY | screeps.RESOURCE_GHODIUM, false> */
@js.native
trait StoreRESOURCEENERGYRESOURAlloy extends StObject {
  
  var G: Double = js.native
  
  var GH: typings.screeps.screepsInts.`0` = js.native
  
  var GH2O: typings.screeps.screepsInts.`0` = js.native
  
  var GHO2: typings.screeps.screepsInts.`0` = js.native
  
  var GO: typings.screeps.screepsInts.`0` = js.native
  
  var H: typings.screeps.screepsInts.`0` = js.native
  
  var K: typings.screeps.screepsInts.`0` = js.native
  
  var KH: typings.screeps.screepsInts.`0` = js.native
  
  var KH2O: typings.screeps.screepsInts.`0` = js.native
  
  var KHO2: typings.screeps.screepsInts.`0` = js.native
  
  var KO: typings.screeps.screepsInts.`0` = js.native
  
  var L: typings.screeps.screepsInts.`0` = js.native
  
  var LH: typings.screeps.screepsInts.`0` = js.native
  
  var LH2O: typings.screeps.screepsInts.`0` = js.native
  
  var LHO2: typings.screeps.screepsInts.`0` = js.native
  
  var LO: typings.screeps.screepsInts.`0` = js.native
  
  var O: typings.screeps.screepsInts.`0` = js.native
  
  var OH: typings.screeps.screepsInts.`0` = js.native
  
  var U: typings.screeps.screepsInts.`0` = js.native
  
  var UH: typings.screeps.screepsInts.`0` = js.native
  
  var UH2O: typings.screeps.screepsInts.`0` = js.native
  
  var UHO2: typings.screeps.screepsInts.`0` = js.native
  
  var UL: typings.screeps.screepsInts.`0` = js.native
  
  var UO: typings.screeps.screepsInts.`0` = js.native
  
  var X: typings.screeps.screepsInts.`0` = js.native
  
  var XGH2O: typings.screeps.screepsInts.`0` = js.native
  
  var XGHO2: typings.screeps.screepsInts.`0` = js.native
  
  var XKH2O: typings.screeps.screepsInts.`0` = js.native
  
  var XKHO2: typings.screeps.screepsInts.`0` = js.native
  
  var XLH2O: typings.screeps.screepsInts.`0` = js.native
  
  var XLHO2: typings.screeps.screepsInts.`0` = js.native
  
  var XUH2O: typings.screeps.screepsInts.`0` = js.native
  
  var XUHO2: typings.screeps.screepsInts.`0` = js.native
  
  var XZH2O: typings.screeps.screepsInts.`0` = js.native
  
  var XZHO2: typings.screeps.screepsInts.`0` = js.native
  
  var Z: typings.screeps.screepsInts.`0` = js.native
  
  var ZH: typings.screeps.screepsInts.`0` = js.native
  
  var ZH2O: typings.screeps.screepsInts.`0` = js.native
  
  var ZHO2: typings.screeps.screepsInts.`0` = js.native
  
  var ZK: typings.screeps.screepsInts.`0` = js.native
  
  var ZO: typings.screeps.screepsInts.`0` = js.native
  
  var alloy: typings.screeps.screepsInts.`0` = js.native
  
  var battery: typings.screeps.screepsInts.`0` = js.native
  
  var biomass: typings.screeps.screepsInts.`0` = js.native
  
  var cell: typings.screeps.screepsInts.`0` = js.native
  
  var circuit: typings.screeps.screepsInts.`0` = js.native
  
  var composite: typings.screeps.screepsInts.`0` = js.native
  
  var concentrate: typings.screeps.screepsInts.`0` = js.native
  
  var condensate: typings.screeps.screepsInts.`0` = js.native
  
  var crystal: typings.screeps.screepsInts.`0` = js.native
  
  var device: typings.screeps.screepsInts.`0` = js.native
  
  var emanation: typings.screeps.screepsInts.`0` = js.native
  
  var energy: Double = js.native
  
  var essence: typings.screeps.screepsInts.`0` = js.native
  
  var extract: typings.screeps.screepsInts.`0` = js.native
  
  var fixtures: typings.screeps.screepsInts.`0` = js.native
  
  var frame: typings.screeps.screepsInts.`0` = js.native
  
  /**
    * Returns capacity of this store for the specified resource. For a general purpose store, it returns total capacity if `resource` is undefined.
    * @param resource The type of the resource.
    * @returns Returns capacity number, or `null` in case of an invalid `resource` for this store type.
    */
  def getCapacity[R /* <: js.UndefOr[ResourceConstant] */](): /* import warning: importer.ImportType#apply Failed type conversion: false extends true ? null : R extends undefined ? screeps.ResourceConstant extends screeps.RESOURCE_ENERGY | screeps.RESOURCE_GHODIUM ? number : null : R extends screeps.RESOURCE_ENERGY | screeps.RESOURCE_GHODIUM ? number : null */ js.Any = js.native
  def getCapacity[R /* <: js.UndefOr[ResourceConstant] */](resource: R): /* import warning: importer.ImportType#apply Failed type conversion: false extends true ? null : R extends undefined ? screeps.ResourceConstant extends screeps.RESOURCE_ENERGY | screeps.RESOURCE_GHODIUM ? number : null : R extends screeps.RESOURCE_ENERGY | screeps.RESOURCE_GHODIUM ? number : null */ js.Any = js.native
  
  /**
    * Returns free capacity for the store. For a limited store, it returns the capacity available for the specified resource if `resource` is defined and valid for this store.
    * @param resource The type of the resource.
    * @returns Returns available capacity number, or `null` in case of an invalid `resource` for this store type.
    */
  def getFreeCapacity[R /* <: js.UndefOr[ResourceConstant] */](): /* import warning: importer.ImportType#apply Failed type conversion: R extends undefined ? screeps.ResourceConstant extends screeps.RESOURCE_ENERGY | screeps.RESOURCE_GHODIUM ? number : null : R extends screeps.RESOURCE_ENERGY | screeps.RESOURCE_GHODIUM ? number : null */ js.Any = js.native
  def getFreeCapacity[R /* <: js.UndefOr[ResourceConstant] */](resource: R): /* import warning: importer.ImportType#apply Failed type conversion: R extends undefined ? screeps.ResourceConstant extends screeps.RESOURCE_ENERGY | screeps.RESOURCE_GHODIUM ? number : null : R extends screeps.RESOURCE_ENERGY | screeps.RESOURCE_GHODIUM ? number : null */ js.Any = js.native
  
  /**
    * Returns the capacity used by the specified resource, or total used capacity for general purpose stores if `resource` is undefined.
    * @param resource The type of the resource.
    * @returns Returns used capacity number, or `null` in case of a not valid `resource` for this store type.
    */
  def getUsedCapacity[R /* <: js.UndefOr[ResourceConstant] */](): /* import warning: importer.ImportType#apply Failed type conversion: R extends undefined ? screeps.ResourceConstant extends screeps.RESOURCE_ENERGY | screeps.RESOURCE_GHODIUM ? number : null : R extends screeps.RESOURCE_ENERGY | screeps.RESOURCE_GHODIUM ? number : null */ js.Any = js.native
  def getUsedCapacity[R /* <: js.UndefOr[ResourceConstant] */](resource: R): /* import warning: importer.ImportType#apply Failed type conversion: R extends undefined ? screeps.ResourceConstant extends screeps.RESOURCE_ENERGY | screeps.RESOURCE_GHODIUM ? number : null : R extends screeps.RESOURCE_ENERGY | screeps.RESOURCE_GHODIUM ? number : null */ js.Any = js.native
  
  var ghodium_melt: typings.screeps.screepsInts.`0` = js.native
  
  var hydraulics: typings.screeps.screepsInts.`0` = js.native
  
  var keanium_bar: typings.screeps.screepsInts.`0` = js.native
  
  var lemergium_bar: typings.screeps.screepsInts.`0` = js.native
  
  var liquid: typings.screeps.screepsInts.`0` = js.native
  
  var machine: typings.screeps.screepsInts.`0` = js.native
  
  var metal: typings.screeps.screepsInts.`0` = js.native
  
  var microchip: typings.screeps.screepsInts.`0` = js.native
  
  var mist: typings.screeps.screepsInts.`0` = js.native
  
  var muscle: typings.screeps.screepsInts.`0` = js.native
  
  var ops: typings.screeps.screepsInts.`0` = js.native
  
  var organism: typings.screeps.screepsInts.`0` = js.native
  
  var organoid: typings.screeps.screepsInts.`0` = js.native
  
  var oxidant: typings.screeps.screepsInts.`0` = js.native
  
  var phlegm: typings.screeps.screepsInts.`0` = js.native
  
  var power: typings.screeps.screepsInts.`0` = js.native
  
  var purifier: typings.screeps.screepsInts.`0` = js.native
  
  var reductant: typings.screeps.screepsInts.`0` = js.native
  
  var silicon: typings.screeps.screepsInts.`0` = js.native
  
  var spirit: typings.screeps.screepsInts.`0` = js.native
  
  var switch: typings.screeps.screepsInts.`0` = js.native
  
  var tissue: typings.screeps.screepsInts.`0` = js.native
  
  var transistor: typings.screeps.screepsInts.`0` = js.native
  
  var tube: typings.screeps.screepsInts.`0` = js.native
  
  var utrium_bar: typings.screeps.screepsInts.`0` = js.native
  
  var wire: typings.screeps.screepsInts.`0` = js.native
  
  var zynthium_bar: typings.screeps.screepsInts.`0` = js.native
}
