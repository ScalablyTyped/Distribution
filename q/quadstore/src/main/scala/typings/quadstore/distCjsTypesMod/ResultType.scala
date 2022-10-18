package typings.quadstore.distCjsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ResultType extends StObject
@JSImport("quadstore/dist/cjs/types", "ResultType")
@js.native
object ResultType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ResultType & String] = js.native
  
  @js.native
  sealed trait APPROXIMATE_SIZE
    extends StObject
       with ResultType
  /* "approximate_size" */ val APPROXIMATE_SIZE: typings.quadstore.distCjsTypesMod.ResultType.APPROXIMATE_SIZE & String = js.native
  
  @js.native
  sealed trait QUADS
    extends StObject
       with ResultType
  /* "quads" */ val QUADS: typings.quadstore.distCjsTypesMod.ResultType.QUADS & String = js.native
  
  @js.native
  sealed trait VOID
    extends StObject
       with ResultType
  /* "void" */ val VOID: typings.quadstore.distCjsTypesMod.ResultType.VOID & String = js.native
}
