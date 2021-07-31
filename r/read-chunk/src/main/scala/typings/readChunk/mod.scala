package typings.readChunk

import typings.node.Buffer
import typings.readChunk.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Read a chunk from a file asyncronously.
  	@param filePath - The path to the file.
  	@param startPosition - Position to start reading.
  	@param length - Number of bytes to read.
  	@returns The read chunk.
  	@example
  	```
  	import readChunk = require('read-chunk');
  	// foo.txt => hello
  	readChunk.sync('foo.txt', 1, 3);
  	//=> 'ell'
  	```
  	*/
  @scala.inline
  def apply(filePath: String, startPosition: Double, length: Double): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].apply(filePath.asInstanceOf[js.Any], startPosition.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  @JSImport("read-chunk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release
  @JSImport("read-chunk", "default")
  @js.native
  def default: Call = js.native
  /**
  	Read a chunk from a file asyncronously.
  	@param filePath - The path to the file.
  	@param startPosition - Position to start reading.
  	@param length - Number of bytes to read.
  	@returns The read chunk.
  	@example
  	```
  	import readChunk = require('read-chunk');
  	// foo.txt => hello
  	readChunk.sync('foo.txt', 1, 3);
  	//=> 'ell'
  	```
  	*/
  // TODO: Remove this for the next major release
  @scala.inline
  def default(filePath: String, startPosition: Double, length: Double): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(filePath.asInstanceOf[js.Any], startPosition.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  @scala.inline
  def default_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  /**
  	Read a chunk from a file synchronously.
  	@param filePath - The path to the file.
  	@param startPosition - Position to start reading.
  	@param length - Number of bytes to read.
  	@returns The read chunk.
  	*/
  @scala.inline
  def sync(filePath: String, startPosition: Double, length: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(filePath.asInstanceOf[js.Any], startPosition.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Buffer]
}
