package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes one part of a creep’s body.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends any ? {  boost :keyof {[part: string] : {[boost: string] : {[action: string] : number}},   work :{  UO :{  harvest :3},   UHO2 :{  harvest :5},   XUHO2 :{  harvest :7},   LH :{  build :1.5,   repair :1.5},   LH2O :{  build :1.8,   repair :1.8},   XLH2O :{  build :2,   repair :2},   ZH :{  dismantle :2},   ZH2O :{  dismantle :3},   XZH2O :{  dismantle :4},   GH :{  upgradeController :1.5},   GH2O :{  upgradeController :1.8},   XGH2O :{  upgradeController :2}},   attack :{  UH :{  attack :2},   UH2O :{  attack :3},   XUH2O :{  attack :4}},   ranged_attack :{  KO :{  rangedAttack :2,   rangedMassAttack :2},   KHO2 :{  rangedAttack :3,   rangedMassAttack :3},   XKHO2 :{  rangedAttack :4,   rangedMassAttack :4}},   heal :{  LO :{  heal :2,   rangedHeal :2},   LHO2 :{  heal :3,   rangedHeal :3},   XLHO2 :{  heal :4,   rangedHeal :4}},   carry :{  KH :{  capacity :2},   KH2O :{  capacity :3},   XKH2O :{  capacity :4}},   move :{  ZO :{  fatigue :2},   ZHO2 :{  fatigue :3},   XZHO2 :{  fatigue :4}},   tough :{  GO :{  damage :0.7},   GHO2 :{  damage :0.5},   XGHO2 :{  damage :0.3}}}[T] | undefined,   type :T,   hits :number} : never
  }}}
  */
@js.native
trait BodyPartDefinition[T /* <: BodyPartConstant */] extends StObject
