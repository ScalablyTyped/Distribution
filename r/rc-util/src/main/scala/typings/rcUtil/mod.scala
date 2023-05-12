package typings.rcUtil

import typings.rcUtil.anon.DefaultValue
import typings.rcUtil.esHooksUseMergedStateMod.Updater
import typings.rcUtil.esWarningMod.preMessageFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def get(entity: Any, path: js.Array[String | Double]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(entity.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def set[Entity, Output, Value](entity: Entity, paths: js.Array[String | Double], value: Value): Output = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(entity.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Output]
  inline def set[Entity, Output, Value](entity: Entity, paths: js.Array[String | Double], value: Value, removeIfUndefined: Boolean): Output = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(entity.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], value.asInstanceOf[js.Any], removeIfUndefined.asInstanceOf[js.Any])).asInstanceOf[Output]
  
  inline def useMergedState[T, R](defaultStateValue: T): js.Tuple2[R, Updater[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMergedState")(defaultStateValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[R, Updater[T]]]
  inline def useMergedState[T, R](defaultStateValue: T, option: DefaultValue[T]): js.Tuple2[R, Updater[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useMergedState")(defaultStateValue.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[R, Updater[T]]]
  inline def useMergedState[T, R](defaultStateValue: js.Function0[T]): js.Tuple2[R, Updater[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMergedState")(defaultStateValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[R, Updater[T]]]
  inline def useMergedState[T, R](defaultStateValue: js.Function0[T], option: DefaultValue[T]): js.Tuple2[R, Updater[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useMergedState")(defaultStateValue.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[R, Updater[T]]]
  
  object warning {
    
    inline def apply(valid: Boolean, message: String): Unit = (^.asInstanceOf[js.Dynamic].apply(valid.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("rc-util", "warning")
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof imported_warning.noteOnce` */
    inline def noteOnce(valid: Boolean, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("noteOnce")(valid.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("rc-util", "warning.preMessage")
    @js.native
    def preMessage: js.Function1[/* fn */ preMessageFn, Unit] = js.native
    inline def preMessage_=(x: js.Function1[/* fn */ preMessageFn, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preMessage")(x.asInstanceOf[js.Any])
    
    /* was `typeof imported_warning.resetWarned` */
    inline def resetWarned(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetWarned")().asInstanceOf[Unit]
  }
}
