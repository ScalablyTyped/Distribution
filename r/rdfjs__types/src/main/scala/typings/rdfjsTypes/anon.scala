package typings.rdfjsTypes

import typings.rdfjsTypes.commonMod.Bindings
import typings.rdfjsTypes.commonMod.QuadTermName
import typings.rdfjsTypes.commonMod.QueryOperationOrder
import typings.rdfjsTypes.commonMod.QueryResultCardinality
import typings.rdfjsTypes.commonMod.ResultStream
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.dataModelMod.Variable
import typings.rdfjsTypes.queryableMod.QueryAlgebraContext
import typings.rdfjsTypes.queryableMod.QueryStringContext
import typings.rdfjsTypes.rdfjsTypesStrings.asc
import typings.rdfjsTypes.rdfjsTypesStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0`[AlgebraType, QueryAlgebraContextType /* <: QueryAlgebraContext */] extends StObject {
    
    def queryBindings(query: AlgebraType): js.Promise[ResultStream[Bindings]] = js.native
    def queryBindings(query: AlgebraType, context: QueryAlgebraContextType): js.Promise[ResultStream[Bindings]] = js.native
  }
  
  @js.native
  trait `1`[AlgebraType, QueryAlgebraContextType /* <: QueryAlgebraContext */] extends StObject {
    
    def queryBoolean(query: AlgebraType): js.Promise[Boolean] = js.native
    def queryBoolean(query: AlgebraType, context: QueryAlgebraContextType): js.Promise[Boolean] = js.native
  }
  
  @js.native
  trait `2`[AlgebraType, QueryAlgebraContextType /* <: QueryAlgebraContext */] extends StObject {
    
    def queryQuads(query: AlgebraType): js.Promise[ResultStream[Quad]] = js.native
    def queryQuads(query: AlgebraType, context: QueryAlgebraContextType): js.Promise[ResultStream[Quad]] = js.native
  }
  
  @js.native
  trait `3`[AlgebraType, QueryAlgebraContextType /* <: QueryAlgebraContext */] extends StObject {
    
    def queryVoid(query: AlgebraType): js.Promise[Unit] = js.native
    def queryVoid(query: AlgebraType, context: QueryAlgebraContextType): js.Promise[Unit] = js.native
  }
  
  trait AvailableOrders[OrderItemsType /* <: QuadTermName | Variable */] extends StObject {
    
    var availableOrders: js.Array[QueryOperationOrder[OrderItemsType]]
  }
  object AvailableOrders {
    
    inline def apply[OrderItemsType /* <: QuadTermName | Variable */](availableOrders: js.Array[QueryOperationOrder[OrderItemsType]]): AvailableOrders[OrderItemsType] = {
      val __obj = js.Dynamic.literal(availableOrders = availableOrders.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvailableOrders[OrderItemsType]]
    }
    
    extension [Self <: AvailableOrders[?], OrderItemsType /* <: QuadTermName | Variable */](x: Self & AvailableOrders[OrderItemsType]) {
      
      inline def setAvailableOrders(value: js.Array[QueryOperationOrder[OrderItemsType]]): Self = StObject.set(x, "availableOrders", value.asInstanceOf[js.Any])
      
      inline def setAvailableOrdersVarargs(value: QueryOperationOrder[OrderItemsType]*): Self = StObject.set(x, "availableOrders", js.Array(value*))
    }
  }
  
  trait Cardinality extends StObject {
    
    var cardinality: QueryResultCardinality
  }
  object Cardinality {
    
    inline def apply(cardinality: QueryResultCardinality): Cardinality = {
      val __obj = js.Dynamic.literal(cardinality = cardinality.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cardinality]
    }
    
    extension [Self <: Cardinality](x: Self) {
      
      inline def setCardinality(value: QueryResultCardinality): Self = StObject.set(x, "cardinality", value.asInstanceOf[js.Any])
    }
  }
  
  trait Direction[T /* <: QuadTermName | Variable */] extends StObject {
    
    var direction: asc | desc
    
    var term: T
  }
  object Direction {
    
    inline def apply[T /* <: QuadTermName | Variable */](direction: asc | desc, term: T): Direction[T] = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
      __obj.asInstanceOf[Direction[T]]
    }
    
    extension [Self <: Direction[?], T /* <: QuadTermName | Variable */](x: Self & Direction[T]) {
      
      inline def setDirection(value: asc | desc): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setTerm(value: T): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    }
  }
  
  trait Order[OrderItemsType /* <: QuadTermName | Variable */] extends StObject {
    
    var order: js.Array[Term[OrderItemsType]]
  }
  object Order {
    
    inline def apply[OrderItemsType /* <: QuadTermName | Variable */](order: js.Array[Term[OrderItemsType]]): Order[OrderItemsType] = {
      val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any])
      __obj.asInstanceOf[Order[OrderItemsType]]
    }
    
    extension [Self <: Order[?], OrderItemsType /* <: QuadTermName | Variable */](x: Self & Order[OrderItemsType]) {
      
      inline def setOrder(value: js.Array[Term[OrderItemsType]]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderVarargs(value: Term[OrderItemsType]*): Self = StObject.set(x, "order", js.Array(value*))
    }
  }
  
  @js.native
  trait QueryBindings[QueryStringContextType /* <: QueryStringContext */] extends StObject {
    
    def queryBindings(query: String): js.Promise[ResultStream[Bindings]] = js.native
    def queryBindings(query: String, context: QueryStringContextType): js.Promise[ResultStream[Bindings]] = js.native
  }
  
  @js.native
  trait QueryBoolean[QueryStringContextType /* <: QueryStringContext */] extends StObject {
    
    def queryBoolean(query: String): js.Promise[Boolean] = js.native
    def queryBoolean(query: String, context: QueryStringContextType): js.Promise[Boolean] = js.native
  }
  
  @js.native
  trait QueryQuads[QueryStringContextType /* <: QueryStringContext */] extends StObject {
    
    def queryQuads(query: String): js.Promise[ResultStream[Quad]] = js.native
    def queryQuads(query: String, context: QueryStringContextType): js.Promise[ResultStream[Quad]] = js.native
  }
  
  @js.native
  trait QueryVoid[QueryStringContextType /* <: QueryStringContext */] extends StObject {
    
    def queryVoid(query: String): js.Promise[Unit] = js.native
    def queryVoid(query: String, context: QueryStringContextType): js.Promise[Unit] = js.native
  }
  
  trait Term[OrderItemsType /* <: QuadTermName | Variable */] extends StObject {
    
    var direction: asc | desc
    
    var term: OrderItemsType
  }
  object Term {
    
    inline def apply[OrderItemsType /* <: QuadTermName | Variable */](direction: asc | desc, term: OrderItemsType): Term[OrderItemsType] = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
      __obj.asInstanceOf[Term[OrderItemsType]]
    }
    
    extension [Self <: Term[?], OrderItemsType /* <: QuadTermName | Variable */](x: Self & Term[OrderItemsType]) {
      
      inline def setDirection(value: asc | desc): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setTerm(value: OrderItemsType): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    }
  }
  
  trait Variables extends StObject {
    
    var variables: js.Array[Variable]
  }
  object Variables {
    
    inline def apply(variables: js.Array[Variable]): Variables = {
      val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[Variables]
    }
    
    extension [Self <: Variables](x: Self) {
      
      inline def setVariables(value: js.Array[Variable]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      inline def setVariablesVarargs(value: Variable*): Self = StObject.set(x, "variables", js.Array(value*))
    }
  }
}
