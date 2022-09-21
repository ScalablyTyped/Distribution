package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildEmitEvents extends StObject {
  
  def emit(eventName: CompilerEventBuildFinish, buildResults: CompilerBuildResults): Unit = js.native
  def emit(eventName: CompilerEventBuildLog, buildLog: BuildLog): Unit = js.native
  def emit(eventName: CompilerEventBuildNoChange, buildNoChange: BuildNoChangeResults): Unit = js.native
  def emit(eventName: CompilerEventBuildStart, buildStart: CompilerBuildStart): Unit = js.native
  def emit(eventName: CompilerEventDirAdd, path: String): Unit = js.native
  def emit(eventName: CompilerEventDirDelete, path: String): Unit = js.native
  def emit(eventName: CompilerEventFileAdd, path: String): Unit = js.native
  def emit(eventName: CompilerEventFileDelete, path: String): Unit = js.native
  def emit(eventName: CompilerEventFileUpdate, path: String): Unit = js.native
  def emit(eventName: CompilerEventFsChange, fsWatchResults: FsWatchResults): Unit = js.native
}
