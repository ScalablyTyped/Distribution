package typings.stencilCore.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import typings.stencilCore.inMemoryFsMod.FsCommitResults
import typings.stencilCore.inMemoryFsMod.FsItem
import typings.stencilCore.inMemoryFsMod.FsReadOptions
import typings.stencilCore.inMemoryFsMod.FsReaddirItem
import typings.stencilCore.inMemoryFsMod.FsReaddirOptions
import typings.stencilCore.inMemoryFsMod.FsStat
import typings.stencilCore.inMemoryFsMod.FsWriteOptions
import typings.stencilCore.inMemoryFsMod.FsWriteResults
import typings.stencilCore.stencilPublicCompilerMod.BuildOutput
import typings.stencilCore.stencilPublicCompilerMod.CompilerSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Access extends StObject {
  
  def access(filePath: String): js.Promise[Boolean] = js.native
  
  def accessSync(filePath: String): Boolean = js.native
  
  def cancelDeleteDirectoriesFromDisk(dirPaths: js.Array[String]): Unit = js.native
  
  def cancelDeleteFilesFromDisk(filePaths: js.Array[String]): Unit = js.native
  
  def clearCache(): Unit = js.native
  
  def clearDirCache(dirPath: String): Unit = js.native
  
  def clearFileCache(filePath: String): Unit = js.native
  
  def commit(): js.Promise[FsCommitResults] = js.native
  
  def copyFile(src: String, dest: String): js.Promise[Unit] = js.native
  
  def emptyDirs(dirs: js.Array[String]): js.Promise[Unit] = js.native
  
  def getBuildOutputs(): js.Array[BuildOutput] = js.native
  
  def getItem(itemPath: String): FsItem = js.native
  
  def getMemoryStats(): String = js.native
  
  def readFile(filePath: String): js.Promise[String] = js.native
  def readFile(filePath: String, opts: FsReadOptions): js.Promise[String] = js.native
  
  def readFileSync(filePath: String): String = js.native
  def readFileSync(filePath: String, opts: FsReadOptions): String = js.native
  
  def readdir(dirPath: String): js.Promise[js.Array[FsReaddirItem]] = js.native
  def readdir(dirPath: String, opts: FsReaddirOptions): js.Promise[js.Array[FsReaddirItem]] = js.native
  
  def remove(itemPath: String): js.Promise[Unit] = js.native
  
  def stat(itemPath: String): js.Promise[FsStat] = js.native
  
  def statSync(itemPath: String): FsStat = js.native
  
  var sys: CompilerSystem = js.native
  
  def writeFile(filePath: String, content: String): js.Promise[FsWriteResults] = js.native
  def writeFile(filePath: String, content: String, opts: FsWriteOptions): js.Promise[FsWriteResults] = js.native
  
  def writeFiles(files: StringDictionary[String]): js.Promise[js.Array[FsWriteResults]] = js.native
  def writeFiles(files: StringDictionary[String], opts: FsWriteOptions): js.Promise[js.Array[FsWriteResults]] = js.native
  def writeFiles(files: Map[String, String]): js.Promise[js.Array[FsWriteResults]] = js.native
  def writeFiles(files: Map[String, String], opts: FsWriteOptions): js.Promise[js.Array[FsWriteResults]] = js.native
}
