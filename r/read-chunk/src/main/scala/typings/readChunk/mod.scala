package typings.readChunk

import typings.node.Buffer
import typings.readChunk.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  @JSImport("read-chunk", JSImport.Namespace)
  @js.native
  def apply(filePath: String, startPosition: Double, length: Double): js.Promise[Buffer] = js.native
  
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
  @JSImport("read-chunk", "default")
  @js.native
  def default(filePath: String, startPosition: Double, length: Double): js.Promise[Buffer] = js.native
  @scala.inline
  def default_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  /**
  	Read a chunk from a file synchronously.
  	@param filePath - The path to the file.
  	@param startPosition - Position to start reading.
  	@param length - Number of bytes to read.
  	@returns The read chunk.
  	*/
  @JSImport("read-chunk", "sync")
  @js.native
  def sync(filePath: String, startPosition: Double, length: Double): Buffer = js.native
}
