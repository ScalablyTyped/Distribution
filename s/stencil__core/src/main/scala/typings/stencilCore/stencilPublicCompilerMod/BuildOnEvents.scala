package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildOnEvents extends StObject {
  
  def on(cb: js.Function2[/* eventName */ CompilerEventName, /* data */ Any, Unit]): BuildOnEventRemove = js.native
  def on(
    eventName: CompilerEventBuildFinish,
    cb: js.Function1[/* buildResults */ CompilerBuildResults, Unit]
  ): BuildOnEventRemove = js.native
  def on(eventName: CompilerEventBuildLog, cb: js.Function1[/* buildLog */ BuildLog, Unit]): BuildOnEventRemove = js.native
  def on(eventName: CompilerEventBuildNoChange, cb: js.Function0[Unit]): BuildOnEventRemove = js.native
  def on(eventName: CompilerEventBuildStart, cb: js.Function1[/* buildStart */ CompilerBuildStart, Unit]): BuildOnEventRemove = js.native
  def on(eventName: CompilerEventDirAdd, cb: js.Function1[/* path */ String, Unit]): BuildOnEventRemove = js.native
  def on(eventName: CompilerEventDirDelete, cb: js.Function1[/* path */ String, Unit]): BuildOnEventRemove = js.native
  def on(eventName: CompilerEventFileAdd, cb: js.Function1[/* path */ String, Unit]): BuildOnEventRemove = js.native
  def on(eventName: CompilerEventFileDelete, cb: js.Function1[/* path */ String, Unit]): BuildOnEventRemove = js.native
  def on(eventName: CompilerEventFileUpdate, cb: js.Function1[/* path */ String, Unit]): BuildOnEventRemove = js.native
}
