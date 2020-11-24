package typings.sat.SAT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Vector extends js.Object {
  
  def add(other: Vector): Vector = js.native
  
  def copy(other: Vector): Vector = js.native
  
  def dot(other: Vector): Double = js.native
  
  def len(): Double = js.native
  
  def len2(): Double = js.native
  
  def normalize(): Vector = js.native
  
  def perp(): Vector = js.native
  
  def project(other: Vector): Vector = js.native
  
  def projectN(other: Vector): Vector = js.native
  
  def reflect(axis: Vector): Vector = js.native
  
  def reflectN(axis: Vector): Vector = js.native
  
  def reverse(): Vector = js.native
  
  def rotate(angle: Double): Vector = js.native
  
  def scale(x: Double): Vector = js.native
  def scale(x: Double, y: Double): Vector = js.native
  
  def sub(other: Vector): Vector = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
