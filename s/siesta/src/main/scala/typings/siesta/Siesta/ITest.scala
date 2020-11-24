package typings.siesta.Siesta

import typings.siesta.Siesta.Test.IBDD
import typings.siesta.Siesta.Test.IDate
import typings.siesta.Siesta.Test.IFunction
import typings.siesta.Siesta.Test.IMore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @abstract
  */
@js.native
trait ITest
  extends IBDD
     with IDate
     with IFunction
     with IMore {
  
  def beginAsync(time: Double, errback: js.Function): js.Any = js.native
  
  def compareObjects(obj1: js.Any, obj2: js.Any): Boolean = js.native
  def compareObjects(
    obj1: js.Any,
    obj2: js.Any,
    strict: js.UndefOr[scala.Nothing],
    onlyPrimitives: js.UndefOr[scala.Nothing],
    asObjects: Boolean
  ): Boolean = js.native
  def compareObjects(obj1: js.Any, obj2: js.Any, strict: js.UndefOr[scala.Nothing], onlyPrimitives: Boolean): Boolean = js.native
  def compareObjects(
    obj1: js.Any,
    obj2: js.Any,
    strict: js.UndefOr[scala.Nothing],
    onlyPrimitives: Boolean,
    asObjects: Boolean
  ): Boolean = js.native
  def compareObjects(obj1: js.Any, obj2: js.Any, strict: Boolean): Boolean = js.native
  def compareObjects(
    obj1: js.Any,
    obj2: js.Any,
    strict: Boolean,
    onlyPrimitives: js.UndefOr[scala.Nothing],
    asObjects: Boolean
  ): Boolean = js.native
  def compareObjects(obj1: js.Any, obj2: js.Any, strict: Boolean, onlyPrimitives: Boolean): Boolean = js.native
  def compareObjects(obj1: js.Any, obj2: js.Any, strict: Boolean, onlyPrimitives: Boolean, asObjects: Boolean): Boolean = js.native
  
  def diag(desc: String): Unit = js.native
  
  def done(delay: Double): Unit = js.native
  
  def endAsync(frame: js.Any): Unit = js.native
  
  def endWait(title: String): Unit = js.native
  
  def fail(desc: String, annotation: js.Any): Unit = js.native
  
  def getSubTest(name: String, code: js.Function1[/* t */ this.type, Unit]): ITest = js.native
  def getSubTest(name: String, code: js.Function1[/* t */ this.type, Unit], timeout: Double): ITest = js.native
  
  def is(got: js.Any, expected: js.Any, desc: String): Unit = js.native
  
  def isNot(got: js.Any, expected: js.Any, desc: String): Unit = js.native
  
  def isNotStrict(got: js.Any, expected: js.Any, desc: String): Unit = js.native
  
  def isReady(): js.Any = js.native
  
  var isReadyTimeout: Double = js.native
  
  def isStrict(got: js.Any, expected: js.Any, desc: String): Unit = js.native
  
  def launchSubTest(subTest: ITest, callback: js.Function): Unit = js.native
  
  def notOk(value: js.Any, desc: String): Unit = js.native
  
  def ok(value: js.Any, desc: String): Unit = js.native
  
  def pass(desc: String, annotation: js.Any): Unit = js.native
  
  def subTest(desc: String, code: js.Function1[/* t */ this.type, Unit], callback: js.Function): Unit = js.native
  def subTest(desc: String, code: js.Function1[/* t */ this.type, Unit], callback: js.Function, timeout: Double): Unit = js.native
  
  def todo(why: String, code: js.Function): Unit = js.native
  
  def typeOf(`object`: js.Any): String = js.native
  
  def wait(title: String, howLong: Double): Unit = js.native
}
