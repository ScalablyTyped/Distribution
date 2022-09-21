package typings.puppeteerCore.anon

import typings.node.fsMod.Dir
import typings.node.fsMod.OpenDirOptions
import typings.node.fsMod.PathLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofopendir extends StObject {
  
  def apply(
    path: PathLike,
    cb: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* dir */ Dir, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: OpenDirOptions,
    cb: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* dir */ Dir, 
      Unit
    ]
  ): Unit = js.native
}
