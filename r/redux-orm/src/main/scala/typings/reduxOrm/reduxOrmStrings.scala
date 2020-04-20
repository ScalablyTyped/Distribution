package typings.reduxOrm

import typings.reduxOrm.databaseMod.QueryType
import typings.reduxOrm.databaseMod.UpdateStatus
import typings.reduxOrm.databaseMod.UpdateType
import typings.reduxOrm.querySetMod.QuerySet.SortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reduxOrmStrings {
  @js.native
  sealed trait DatabaseCreator extends js.Object
  
  @js.native
  sealed trait FAILURE extends UpdateStatus
  
  @js.native
  sealed trait IndexedModelClasses extends js.Object
  
  @js.native
  sealed trait ModelBlueprint extends js.Object
  
  @js.native
  sealed trait ORM extends js.Object
  
  @js.native
  sealed trait ORMOpts extends js.Object
  
  @js.native
  sealed trait OrmSession extends js.Object
  
  @js.native
  sealed trait OrmState extends js.Object
  
  @js.native
  sealed trait REDUX_ORM_CREATE extends UpdateType
  
  @js.native
  sealed trait REDUX_ORM_DELETE extends UpdateType
  
  @js.native
  sealed trait REDUX_ORM_EXCLUDE extends QueryType
  
  @js.native
  sealed trait REDUX_ORM_FILTER extends QueryType
  
  @js.native
  sealed trait REDUX_ORM_ORDER_BY extends QueryType
  
  @js.native
  sealed trait REDUX_ORM_UPDATE extends UpdateType
  
  @js.native
  sealed trait Ref extends js.Object
  
  @js.native
  sealed trait SUCCESS extends UpdateStatus
  
  @js.native
  sealed trait SchemaSpec extends js.Object
  
  @js.native
  sealed trait SessionBoundModel extends js.Object
  
  @js.native
  sealed trait TableIndexes extends js.Object
  
  @js.native
  sealed trait arrName extends js.Object
  
  @js.native
  sealed trait asc extends SortOrder
  
  @js.native
  sealed trait attr extends js.Object
  
  @js.native
  sealed trait createDatabase extends js.Object
  
  @js.native
  sealed trait default extends js.Object
  
  @js.native
  sealed trait desc extends SortOrder
  
  @js.native
  sealed trait fields extends js.Object
  
  @js.native
  sealed trait fk extends js.Object
  
  @js.native
  sealed trait id extends js.Object
  
  @js.native
  sealed trait idAttribute extends js.Object
  
  @js.native
  sealed trait items extends js.Object
  
  @js.native
  sealed trait itemsById extends js.Object
  
  @js.native
  sealed trait many extends js.Object
  
  @js.native
  sealed trait mapName extends js.Object
  
  @js.native
  sealed trait oneToOne extends js.Object
  
  @scala.inline
  def DatabaseCreator: DatabaseCreator = "DatabaseCreator".asInstanceOf[DatabaseCreator]
  @scala.inline
  def FAILURE: FAILURE = "FAILURE".asInstanceOf[FAILURE]
  @scala.inline
  def IndexedModelClasses: IndexedModelClasses = "IndexedModelClasses".asInstanceOf[IndexedModelClasses]
  @scala.inline
  def ModelBlueprint: ModelBlueprint = "ModelBlueprint".asInstanceOf[ModelBlueprint]
  @scala.inline
  def ORM: ORM = "ORM".asInstanceOf[ORM]
  @scala.inline
  def ORMOpts: ORMOpts = "ORMOpts".asInstanceOf[ORMOpts]
  @scala.inline
  def OrmSession: OrmSession = "OrmSession".asInstanceOf[OrmSession]
  @scala.inline
  def OrmState: OrmState = "OrmState".asInstanceOf[OrmState]
  @scala.inline
  def REDUX_ORM_CREATE: REDUX_ORM_CREATE = "REDUX_ORM_CREATE".asInstanceOf[REDUX_ORM_CREATE]
  @scala.inline
  def REDUX_ORM_DELETE: REDUX_ORM_DELETE = "REDUX_ORM_DELETE".asInstanceOf[REDUX_ORM_DELETE]
  @scala.inline
  def REDUX_ORM_EXCLUDE: REDUX_ORM_EXCLUDE = "REDUX_ORM_EXCLUDE".asInstanceOf[REDUX_ORM_EXCLUDE]
  @scala.inline
  def REDUX_ORM_FILTER: REDUX_ORM_FILTER = "REDUX_ORM_FILTER".asInstanceOf[REDUX_ORM_FILTER]
  @scala.inline
  def REDUX_ORM_ORDER_BY: REDUX_ORM_ORDER_BY = "REDUX_ORM_ORDER_BY".asInstanceOf[REDUX_ORM_ORDER_BY]
  @scala.inline
  def REDUX_ORM_UPDATE: REDUX_ORM_UPDATE = "REDUX_ORM_UPDATE".asInstanceOf[REDUX_ORM_UPDATE]
  @scala.inline
  def Ref: Ref = "Ref".asInstanceOf[Ref]
  @scala.inline
  def SUCCESS: SUCCESS = "SUCCESS".asInstanceOf[SUCCESS]
  @scala.inline
  def SchemaSpec: SchemaSpec = "SchemaSpec".asInstanceOf[SchemaSpec]
  @scala.inline
  def SessionBoundModel: SessionBoundModel = "SessionBoundModel".asInstanceOf[SessionBoundModel]
  @scala.inline
  def TableIndexes: TableIndexes = "TableIndexes".asInstanceOf[TableIndexes]
  @scala.inline
  def arrName: arrName = "arrName".asInstanceOf[arrName]
  @scala.inline
  def asc: asc = "asc".asInstanceOf[asc]
  @scala.inline
  def attr: attr = "attr".asInstanceOf[attr]
  @scala.inline
  def createDatabase: createDatabase = "createDatabase".asInstanceOf[createDatabase]
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  @scala.inline
  def desc: desc = "desc".asInstanceOf[desc]
  @scala.inline
  def fields: fields = "fields".asInstanceOf[fields]
  @scala.inline
  def fk: fk = "fk".asInstanceOf[fk]
  @scala.inline
  def id: id = "id".asInstanceOf[id]
  @scala.inline
  def idAttribute: idAttribute = "idAttribute".asInstanceOf[idAttribute]
  @scala.inline
  def items: items = "items".asInstanceOf[items]
  @scala.inline
  def itemsById: itemsById = "itemsById".asInstanceOf[itemsById]
  @scala.inline
  def many: many = "many".asInstanceOf[many]
  @scala.inline
  def mapName: mapName = "mapName".asInstanceOf[mapName]
  @scala.inline
  def oneToOne: oneToOne = "oneToOne".asInstanceOf[oneToOne]
}

