package typings.puppeteerCore.anon

import typings.node.NodeJS.ErrnoException
import typings.node.anon.ObjectEncodingOptionsflag
import typings.node.anon.encodingBufferEncodingflaEncoding
import typings.node.anon.encodingnullundefinedflagEncoding
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.fsMod.PathOrFileDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofreadFile extends StObject {
  
  def apply(
    path: PathOrFileDescriptor,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer, Unit]
  ): Unit = js.native
  def apply(
    path: PathOrFileDescriptor,
    options: Null,
    callback: js.Function2[ErrnoException | Null, (/* data */ Buffer) | String, Unit]
  ): Unit = js.native
  def apply(
    path: PathOrFileDescriptor,
    options: Unit,
    callback: js.Function2[ErrnoException | Null, (/* data */ Buffer) | String, Unit]
  ): Unit = js.native
  def apply(
    path: PathOrFileDescriptor,
    options: ObjectEncodingOptionsflag,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ String | Buffer, Unit]
  ): Unit = js.native
  def apply(
    path: PathOrFileDescriptor,
    options: encodingBufferEncodingflaEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ String, Unit]
  ): Unit = js.native
  def apply(
    path: PathOrFileDescriptor,
    options: encodingnullundefinedflagEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer, Unit]
  ): Unit = js.native
  def apply(
    path: PathOrFileDescriptor,
    options: BufferEncoding,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* data */ String), Unit]
  ): Unit = js.native
}
