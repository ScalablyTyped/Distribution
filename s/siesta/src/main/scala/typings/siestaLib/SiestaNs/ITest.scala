package typings
package siestaLib.SiestaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * @abstract
     */
@js.native
trait ITest
  extends siestaLib.SiestaNs.TestNs.IBDD
     with siestaLib.SiestaNs.TestNs.IDate
     with siestaLib.SiestaNs.TestNs.IFunction
     with siestaLib.SiestaNs.TestNs.IMore {
  var isReadyTimeout: scala.Double = js.native
  def beginAsync(time: scala.Double, errback: js.Function): js.Any = js.native
  def compareObjects(obj1: js.Any, obj2: js.Any): scala.Boolean = js.native
  def compareObjects(obj1: js.Any, obj2: js.Any, strict: scala.Boolean): scala.Boolean = js.native
  def compareObjects(obj1: js.Any, obj2: js.Any, strict: scala.Boolean, onlyPrimitives: scala.Boolean): scala.Boolean = js.native
  def compareObjects(
    obj1: js.Any,
    obj2: js.Any,
    strict: scala.Boolean,
    onlyPrimitives: scala.Boolean,
    asObjects: scala.Boolean
  ): scala.Boolean = js.native
  def diag(desc: java.lang.String): scala.Unit = js.native
  def done(delay: scala.Double): scala.Unit = js.native
  def endAsync(frame: js.Any): scala.Unit = js.native
  def endWait(title: java.lang.String): scala.Unit = js.native
  def fail(desc: java.lang.String, annotation: js.Any): scala.Unit = js.native
  def getSubTest(name: java.lang.String, code: js.Function1[/* t */ this.type, scala.Unit]): ITest = js.native
  def getSubTest(name: java.lang.String, code: js.Function1[/* t */ this.type, scala.Unit], timeout: scala.Double): ITest = js.native
  def is(got: js.Any, expected: js.Any, desc: java.lang.String): scala.Unit = js.native
  def isNot(got: js.Any, expected: js.Any, desc: java.lang.String): scala.Unit = js.native
  def isNotStrict(got: js.Any, expected: js.Any, desc: java.lang.String): scala.Unit = js.native
  def isReady(): js.Any = js.native
  def isStrict(got: js.Any, expected: js.Any, desc: java.lang.String): scala.Unit = js.native
  def launchSubTest(subTest: ITest, callback: js.Function): scala.Unit = js.native
  def notOk(value: js.Any, desc: java.lang.String): scala.Unit = js.native
  def ok(value: js.Any, desc: java.lang.String): scala.Unit = js.native
  def pass(desc: java.lang.String, annotation: js.Any): scala.Unit = js.native
  def subTest(desc: java.lang.String, code: js.Function1[/* t */ this.type, scala.Unit], callback: js.Function): scala.Unit = js.native
  def subTest(
    desc: java.lang.String,
    code: js.Function1[/* t */ this.type, scala.Unit],
    callback: js.Function,
    timeout: scala.Double
  ): scala.Unit = js.native
  def todo(why: java.lang.String, code: js.Function): scala.Unit = js.native
  def typeOf(`object`: js.Any): java.lang.String = js.native
  def wait(title: java.lang.String, howLong: scala.Double): scala.Unit = js.native
}

