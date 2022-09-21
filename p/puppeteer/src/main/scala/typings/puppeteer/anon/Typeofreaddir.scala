package typings.puppeteer.anon

import typings.node.anon.Encoding
import typings.node.anon.ObjectEncodingOptionswith
import typings.node.anon.ObjectEncodingOptionswithEncoding
import typings.node.anon.WithFileTypes
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.fsMod.Dirent
import typings.node.fsMod.PathLike
import typings.puppeteer.puppeteerStrings.buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofreaddir extends StObject {
  
  def apply(
    path: PathLike,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* files */ js.Array[String], 
      Unit
    ]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: Null,
    callback: js.Function2[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* files */ js.Array[Buffer | String], 
      Unit
    ]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: Unit,
    callback: js.Function2[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* files */ js.Array[Buffer | String], 
      Unit
    ]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: Encoding,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* files */ js.Array[Buffer], 
      Unit
    ]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: ObjectEncodingOptionswithEncoding,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* files */ js.Array[Dirent], 
      Unit
    ]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: ObjectEncodingOptionswith,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* files */ js.Array[Buffer | String], 
      Unit
    ]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: WithFileTypes,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* files */ js.Array[String], 
      Unit
    ]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: BufferEncoding,
    callback: js.Function2[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* files */ js.Array[Buffer | String], 
      Unit
    ]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: buffer,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* files */ js.Array[Buffer], 
      Unit
    ]
  ): Unit = js.native
}
