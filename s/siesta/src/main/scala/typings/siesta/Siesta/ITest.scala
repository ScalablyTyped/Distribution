package typings.siesta.Siesta

import typings.siesta.Siesta.Test.IBDD
import typings.siesta.Siesta.Test.IDate
import typings.siesta.Siesta.Test.IFunction
import typings.siesta.Siesta.Test.IMore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @abstract
  */
@js.native
trait ITest
  extends StObject
     with IBDD
     with IDate
     with IFunction
     with IMore {
  
  def beginAsync(time: Double, errback: js.Function): Any = js.native
  
  def compareObjects(obj1: Any, obj2: Any): Boolean = js.native
  def compareObjects(obj1: Any, obj2: Any, strict: Boolean): Boolean = js.native
  def compareObjects(obj1: Any, obj2: Any, strict: Boolean, onlyPrimitives: Boolean): Boolean = js.native
  def compareObjects(obj1: Any, obj2: Any, strict: Boolean, onlyPrimitives: Boolean, asObjects: Boolean): Boolean = js.native
  def compareObjects(obj1: Any, obj2: Any, strict: Boolean, onlyPrimitives: Unit, asObjects: Boolean): Boolean = js.native
  def compareObjects(obj1: Any, obj2: Any, strict: Unit, onlyPrimitives: Boolean): Boolean = js.native
  def compareObjects(obj1: Any, obj2: Any, strict: Unit, onlyPrimitives: Boolean, asObjects: Boolean): Boolean = js.native
  def compareObjects(obj1: Any, obj2: Any, strict: Unit, onlyPrimitives: Unit, asObjects: Boolean): Boolean = js.native
  
  def diag(desc: String): Unit = js.native
  
  def done(delay: Double): Unit = js.native
  
  def endAsync(frame: Any): Unit = js.native
  
  def endWait(title: String): Unit = js.native
  
  def fail(desc: String, annotation: Any): Unit = js.native
  
  def getSubTest(name: String, code: js.Function1[/* t */ this.type, Unit]): ITest = js.native
  def getSubTest(name: String, code: js.Function1[/* t */ this.type, Unit], timeout: Double): ITest = js.native
  
  def is(got: Any, expected: Any, desc: String): Unit = js.native
  
  def isNot(got: Any, expected: Any, desc: String): Unit = js.native
  
  def isNotStrict(got: Any, expected: Any, desc: String): Unit = js.native
  
  def isReady(): Any = js.native
  
  var isReadyTimeout: Double = js.native
  
  def isStrict(got: Any, expected: Any, desc: String): Unit = js.native
  
  def launchSubTest(subTest: ITest, callback: js.Function): Unit = js.native
  
  def notOk(value: Any, desc: String): Unit = js.native
  
  def ok(value: Any, desc: String): Unit = js.native
  
  def pass(desc: String, annotation: Any): Unit = js.native
  
  def subTest(desc: String, code: js.Function1[/* t */ this.type, Unit], callback: js.Function): Unit = js.native
  def subTest(desc: String, code: js.Function1[/* t */ this.type, Unit], callback: js.Function, timeout: Double): Unit = js.native
  
  def todo(why: String, code: js.Function): Unit = js.native
  
  def typeOf(`object`: Any): String = js.native
  
  def wait(title: String, howLong: Double): Unit = js.native
}
