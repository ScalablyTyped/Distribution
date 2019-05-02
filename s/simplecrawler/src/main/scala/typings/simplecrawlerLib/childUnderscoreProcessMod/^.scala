package typings
package simplecrawlerLib.childUnderscoreProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("child_process", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def exec(command: java.lang.String): ChildProcess = js.native
  def exec(
    command: java.lang.String,
    callback: js.Function3[
      /* error */ simplecrawlerLib.Error, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): ChildProcess = js.native
  def exec(command: java.lang.String, options: ExecOptions): ChildProcess = js.native
  def exec(command: java.lang.String, options: ExecOptionsWithBufferEncoding): ChildProcess = js.native
  def exec(
    command: java.lang.String,
    options: ExecOptionsWithBufferEncoding,
    callback: js.Function3[
      /* error */ simplecrawlerLib.Error, 
      /* stdout */ simplecrawlerLib.Buffer, 
      /* stderr */ simplecrawlerLib.Buffer, 
      scala.Unit
    ]
  ): ChildProcess = js.native
  def exec(command: java.lang.String, options: ExecOptionsWithStringEncoding): ChildProcess = js.native
  def exec(
    command: java.lang.String,
    options: ExecOptionsWithStringEncoding,
    callback: js.Function3[
      /* error */ simplecrawlerLib.Error, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): ChildProcess = js.native
  def exec(
    command: java.lang.String,
    options: ExecOptions,
    callback: js.Function3[
      /* error */ simplecrawlerLib.Error, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): ChildProcess = js.native
  def execFile(file: java.lang.String): ChildProcess = js.native
  def execFile(file: java.lang.String, args: js.Array[java.lang.String]): ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    callback: js.Function3[
      /* error */ simplecrawlerLib.Error, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): ChildProcess = js.native
  def execFile(file: java.lang.String, args: js.Array[java.lang.String], options: ExecFileOptions): ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: ExecFileOptionsWithBufferEncoding
  ): ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[
      /* error */ simplecrawlerLib.Error, 
      /* stdout */ simplecrawlerLib.Buffer, 
      /* stderr */ simplecrawlerLib.Buffer, 
      scala.Unit
    ]
  ): ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: ExecFileOptionsWithStringEncoding
  ): ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: ExecFileOptionsWithStringEncoding,
    callback: js.Function3[
      /* error */ simplecrawlerLib.Error, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: ExecFileOptions,
    callback: js.Function3[
      /* error */ simplecrawlerLib.Error, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    callback: js.Function3[
      /* error */ simplecrawlerLib.Error, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): ChildProcess = js.native
  def execFile(file: java.lang.String, options: ExecFileOptions): ChildProcess = js.native
  def execFile(file: java.lang.String, options: ExecFileOptionsWithBufferEncoding): ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    options: ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[
      /* error */ simplecrawlerLib.Error, 
      /* stdout */ simplecrawlerLib.Buffer, 
      /* stderr */ simplecrawlerLib.Buffer, 
      scala.Unit
    ]
  ): ChildProcess = js.native
  def execFile(file: java.lang.String, options: ExecFileOptionsWithStringEncoding): ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    options: ExecFileOptionsWithStringEncoding,
    callback: js.Function3[
      /* error */ simplecrawlerLib.Error, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    options: ExecFileOptions,
    callback: js.Function3[
      /* error */ simplecrawlerLib.Error, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): ChildProcess = js.native
  def execFileSync(command: java.lang.String): simplecrawlerLib.Buffer = js.native
  def execFileSync(command: java.lang.String, args: js.Array[java.lang.String]): simplecrawlerLib.Buffer = js.native
  def execFileSync(command: java.lang.String, args: js.Array[java.lang.String], options: ExecFileSyncOptions): simplecrawlerLib.Buffer = js.native
  def execFileSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: ExecFileSyncOptionsWithBufferEncoding
  ): simplecrawlerLib.Buffer = js.native
  def execFileSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: ExecFileSyncOptionsWithStringEncoding
  ): java.lang.String = js.native
  def execFileSync(command: java.lang.String, options: ExecFileSyncOptions): simplecrawlerLib.Buffer = js.native
  def execFileSync(command: java.lang.String, options: ExecFileSyncOptionsWithBufferEncoding): simplecrawlerLib.Buffer = js.native
  def execFileSync(command: java.lang.String, options: ExecFileSyncOptionsWithStringEncoding): java.lang.String = js.native
  @JSName("execFileSync")
  def execFileSync_String(command: java.lang.String): java.lang.String = js.native
  @JSName("execFileSync")
  def execFileSync_String(command: java.lang.String, args: js.Array[java.lang.String]): java.lang.String = js.native
  def execSync(command: java.lang.String): simplecrawlerLib.Buffer = js.native
  def execSync(command: java.lang.String, options: ExecSyncOptions): simplecrawlerLib.Buffer = js.native
  def execSync(command: java.lang.String, options: ExecSyncOptionsWithBufferEncoding): simplecrawlerLib.Buffer = js.native
  def execSync(command: java.lang.String, options: ExecSyncOptionsWithStringEncoding): java.lang.String = js.native
  @JSName("execSync")
  def execSync_String(command: java.lang.String): java.lang.String = js.native
  def fork(modulePath: java.lang.String): ChildProcess = js.native
  def fork(modulePath: java.lang.String, args: js.Array[java.lang.String]): ChildProcess = js.native
  def fork(modulePath: java.lang.String, args: js.Array[java.lang.String], options: ForkOptions): ChildProcess = js.native
  def spawn(command: java.lang.String): ChildProcess = js.native
  def spawn(command: java.lang.String, args: js.Array[java.lang.String]): ChildProcess = js.native
  def spawn(command: java.lang.String, args: js.Array[java.lang.String], options: SpawnOptions): ChildProcess = js.native
  def spawnSync(command: java.lang.String): SpawnSyncReturns[simplecrawlerLib.Buffer] = js.native
  def spawnSync(command: java.lang.String, args: js.Array[java.lang.String]): SpawnSyncReturns[java.lang.String] = js.native
  def spawnSync(command: java.lang.String, args: js.Array[java.lang.String], options: SpawnSyncOptions): SpawnSyncReturns[simplecrawlerLib.Buffer] = js.native
  def spawnSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: SpawnSyncOptionsWithBufferEncoding
  ): SpawnSyncReturns[simplecrawlerLib.Buffer] = js.native
  def spawnSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: SpawnSyncOptionsWithStringEncoding
  ): SpawnSyncReturns[java.lang.String] = js.native
  def spawnSync(command: java.lang.String, options: SpawnSyncOptions): SpawnSyncReturns[simplecrawlerLib.Buffer] = js.native
  def spawnSync(command: java.lang.String, options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[simplecrawlerLib.Buffer] = js.native
  def spawnSync(command: java.lang.String, options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[java.lang.String] = js.native
}

