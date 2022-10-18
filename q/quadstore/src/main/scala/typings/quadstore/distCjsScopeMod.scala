package typings.quadstore

import typings.abstractLevel.mod.AbstractChainedBatch
import typings.quadstore.anon.Gte
import typings.quadstore.distCjsQuadstoreMod.Quadstore
import typings.rdfjsTypes.dataModelMod.BlankNode
import typings.rdfjsTypes.dataModelMod.DataFactory
import typings.rdfjsTypes.dataModelMod.Quad
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsScopeMod {
  
  @JSImport("quadstore/dist/cjs/scope", "Scope")
  @js.native
  open class Scope protected () extends StObject {
    def this(factory: DataFactory[Quad, Quad], id: String, blankNodes: Map[String, BlankNode]) = this()
    
    val blankNodes: Map[String, BlankNode] = js.native
    
    val factory: DataFactory[Quad, Quad] = js.native
    
    val id: String = js.native
    
    /* private */ var parseBlankNode: Any = js.native
    
    /* private */ var parseGraph: Any = js.native
    
    /* private */ var parseObject: Any = js.native
    
    def parseQuad(quad: Quad, batch: AbstractChainedBatch[Any, Any, Any]): Quad = js.native
    
    /* private */ var parseSubject: Any = js.native
  }
  /* static members */
  object Scope {
    
    @JSImport("quadstore/dist/cjs/scope", "Scope")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addMappingToLevelBatch(
      scopeId: String,
      batch: AbstractChainedBatch[Any, Any, Any],
      originalLabel: String,
      randomLabel: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addMappingToLevelBatch")(scopeId.asInstanceOf[js.Any], batch.asInstanceOf[js.Any], originalLabel.asInstanceOf[js.Any], randomLabel.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def delete(store: Quadstore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")(store.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def delete(store: Quadstore, scopeId: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("delete")(store.asInstanceOf[js.Any], scopeId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def getLevelIteratorOpts(keys: Boolean, values: Boolean): Gte = (^.asInstanceOf[js.Dynamic].applyDynamic("getLevelIteratorOpts")(keys.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Gte]
    inline def getLevelIteratorOpts(keys: Boolean, values: Boolean, scopeId: String): Gte = (^.asInstanceOf[js.Dynamic].applyDynamic("getLevelIteratorOpts")(keys.asInstanceOf[js.Any], values.asInstanceOf[js.Any], scopeId.asInstanceOf[js.Any])).asInstanceOf[Gte]
    
    inline def init(store: Quadstore): js.Promise[Scope] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(store.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Scope]]
    
    inline def load(store: Quadstore, scopeId: String): js.Promise[Scope] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(store.asInstanceOf[js.Any], scopeId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scope]]
  }
}
