package typings.senchaTouch.global.Ext.draw

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.draw.IMatrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.draw.Matrix")
@js.native
class Matrix ()
  extends typings.senchaTouch.Ext.draw.Matrix

/* static members */
@JSGlobal("Ext.draw.Matrix")
@js.native
object Matrix extends js.Object {
  /** [Method] Add methods  properties to the prototype of this class
    * @param members Object
    */
  def addMembers(): Unit = js.native
  def addMembers(members: js.Any): Unit = js.native
  /** [Method] Add  override static properties of this class
    * @param members Object
    * @returns Ext.Base this
    */
  def addStatics(): IBase = js.native
  def addStatics(members: js.Any): IBase = js.native
  /** [Method]
    * @param args Object
    */
  def callParent(): Unit = js.native
  def callParent(args: js.Any): Unit = js.native
  /** [Method] Create a matrix from mat
    * @param mat Mixed
    * @returns Ext.draw.Matrix
    */
  def create(): IMatrix = js.native
  def create(mat: js.Any): IMatrix = js.native
  /** [Method] Return the affine matrix that transform two points x0 y0 and x1 y1 to x0p y0p and x1p y1p
    * @param x0 Number
    * @param y0 Number
    * @param x1 Number
    * @param y1 Number
    * @param x0p Number
    * @param y0p Number
    * @param x1p Number
    * @param y1p Number
    */
  def createAffineMatrixFromTwoPair(
    x0: js.UndefOr[Double],
    y0: js.UndefOr[Double],
    x1: js.UndefOr[Double],
    y1: js.UndefOr[Double],
    x0p: js.UndefOr[Double],
    y0p: js.UndefOr[Double],
    x1p: js.UndefOr[Double],
    y1p: js.UndefOr[Double]
  ): Unit = js.native
  /** [Method] Create aliases for existing prototype methods
    * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
    * @param origin String/Object The original method name
    */
  def createAlias(): Unit = js.native
  def createAlias(alias: js.UndefOr[scala.Nothing], origin: js.Any): Unit = js.native
  def createAlias(alias: js.Any): Unit = js.native
  def createAlias(alias: js.Any, origin: js.Any): Unit = js.native
  /** [Method] Return the affine matrix that transform two points x0 y0 and x1 y1 to x0p y0p and x1p y1p
    * @param x0 Number
    * @param y0 Number
    * @param x1 Number
    * @param y1 Number
    * @param x0p Number
    * @param y0p Number
    * @param x1p Number
    * @param y1p Number
    */
  def createPanZoomFromTwoPair(
    x0: js.UndefOr[Double],
    y0: js.UndefOr[Double],
    x1: js.UndefOr[Double],
    y1: js.UndefOr[Double],
    x0p: js.UndefOr[Double],
    y0p: js.UndefOr[Double],
    x1p: js.UndefOr[Double],
    y1p: js.UndefOr[Double]
  ): Unit = js.native
  /** [Method] Create a flyweight to wrap the given array
    * @param elements Array
    * @returns Ext.draw.Matrix
    */
  def fly(): IMatrix = js.native
  def fly(elements: Array): IMatrix = js.native
  /** [Method] Get the current class name in string format
    * @returns String className
    */
  def getName(): String = js.native
  /** [Method] Override members of this class
    * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
    * @returns Ext.Base this class
    */
  def `override`(): IBase = js.native
  def `override`(members: js.Any): IBase = js.native
}

