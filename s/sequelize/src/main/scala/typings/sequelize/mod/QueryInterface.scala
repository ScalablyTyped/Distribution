package typings.sequelize.mod

import typings.sequelize.anon.DefineIndexOptionsfieldsA
import typings.sequelize.anon.Logging
import typings.sequelize.anon.Schema
import typings.sequelize.anon.SchemaTableName
import typings.sequelize.anon.TableName
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface that Sequelize uses to talk to all databases.
  *
  * This interface is available through sequelize.QueryInterface. It should not be commonly used, but it's
  * referenced anyway, so it can be used.
  */
@js.native
trait QueryInterface extends StObject {
  
  /**
    * Returns the dialect-specific sql generator.
    *
    * We don't have a definition for the QueryGenerator, because I doubt it is commonly in use separately.
    */
  var QueryGenerator: js.Any = js.native
  
  def addColumn(tableName: String, key: String, attribute: DataTypeAbstract): typings.bluebird.mod.^[Unit] = js.native
  def addColumn(tableName: String, key: String, attribute: DataTypeAbstract, options: QueryInterfaceOptions): typings.bluebird.mod.^[Unit] = js.native
  /**
    * Adds a new column to a table
    */
  def addColumn(tableName: String, key: String, attribute: DefineAttributeColumnOptions): typings.bluebird.mod.^[Unit] = js.native
  def addColumn(
    tableName: String,
    key: String,
    attribute: DefineAttributeColumnOptions,
    options: QueryInterfaceOptions
  ): typings.bluebird.mod.^[Unit] = js.native
  def addColumn(tableName: TableName, key: String, attribute: DataTypeAbstract): typings.bluebird.mod.^[Unit] = js.native
  def addColumn(tableName: TableName, key: String, attribute: DataTypeAbstract, options: QueryInterfaceOptions): typings.bluebird.mod.^[Unit] = js.native
  def addColumn(tableName: TableName, key: String, attribute: DefineAttributeColumnOptions): typings.bluebird.mod.^[Unit] = js.native
  def addColumn(
    tableName: TableName,
    key: String,
    attribute: DefineAttributeColumnOptions,
    options: QueryInterfaceOptions
  ): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Adds constraints to a table
    */
  def addConstraint(tableName: String, attributes: js.Array[String]): typings.bluebird.mod.^[Unit] = js.native
  def addConstraint(tableName: String, attributes: js.Array[String], options: AddConstraintOptions): typings.bluebird.mod.^[Unit] = js.native
  def addConstraint(tableName: String, attributes: js.Array[String], options: QueryInterfaceOptions): typings.bluebird.mod.^[Unit] = js.native
  
  def addIndex(tableName: String, attributes: js.Array[String]): typings.bluebird.mod.^[Unit] = js.native
  def addIndex(
    tableName: String,
    attributes: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    rawTablename: String
  ): typings.bluebird.mod.^[Unit] = js.native
  def addIndex(tableName: String, attributes: js.Array[String], options: DefineIndexOptions): typings.bluebird.mod.^[Unit] = js.native
  def addIndex(tableName: String, attributes: js.Array[String], options: DefineIndexOptions, rawTablename: String): typings.bluebird.mod.^[Unit] = js.native
  /**
    * Adds a new index to a table
    */
  def addIndex(tableName: String, options: DefineIndexOptionsfieldsA): typings.bluebird.mod.^[Unit] = js.native
  def addIndex(tableName: String, options: DefineIndexOptionsfieldsA, rawTablename: String): typings.bluebird.mod.^[Unit] = js.native
  def addIndex(tableName: js.Object, attributes: js.Array[String]): typings.bluebird.mod.^[Unit] = js.native
  def addIndex(
    tableName: js.Object,
    attributes: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    rawTablename: String
  ): typings.bluebird.mod.^[Unit] = js.native
  def addIndex(tableName: js.Object, attributes: js.Array[String], options: DefineIndexOptions): typings.bluebird.mod.^[Unit] = js.native
  def addIndex(
    tableName: js.Object,
    attributes: js.Array[String],
    options: DefineIndexOptions,
    rawTablename: String
  ): typings.bluebird.mod.^[Unit] = js.native
  def addIndex(tableName: js.Object, options: DefineIndexOptionsfieldsA): typings.bluebird.mod.^[Unit] = js.native
  def addIndex(tableName: js.Object, options: DefineIndexOptionsfieldsA, rawTablename: String): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Deletes multiple rows at once
    */
  def bulkDelete(tableName: String, identifier: js.Object): typings.bluebird.mod.^[js.Object] = js.native
  def bulkDelete(
    tableName: String,
    identifier: js.Object,
    options: js.UndefOr[scala.Nothing],
    model: Model[_, _, _]
  ): typings.bluebird.mod.^[js.Object] = js.native
  def bulkDelete(tableName: String, identifier: js.Object, options: QueryOptions): typings.bluebird.mod.^[js.Object] = js.native
  def bulkDelete(tableName: String, identifier: js.Object, options: QueryOptions, model: Model[_, _, _]): typings.bluebird.mod.^[js.Object] = js.native
  
  /**
    * Inserts multiple records at once
    */
  def bulkInsert(tableName: String, records: js.Array[js.Object]): typings.bluebird.mod.^[js.Object] = js.native
  def bulkInsert(
    tableName: String,
    records: js.Array[js.Object],
    options: js.UndefOr[scala.Nothing],
    attributes: String
  ): typings.bluebird.mod.^[js.Object] = js.native
  def bulkInsert(
    tableName: String,
    records: js.Array[js.Object],
    options: js.UndefOr[scala.Nothing],
    attributes: js.Array[String]
  ): typings.bluebird.mod.^[js.Object] = js.native
  def bulkInsert(tableName: String, records: js.Array[js.Object], options: QueryOptions): typings.bluebird.mod.^[js.Object] = js.native
  def bulkInsert(tableName: String, records: js.Array[js.Object], options: QueryOptions, attributes: String): typings.bluebird.mod.^[js.Object] = js.native
  def bulkInsert(
    tableName: String,
    records: js.Array[js.Object],
    options: QueryOptions,
    attributes: js.Array[String]
  ): typings.bluebird.mod.^[js.Object] = js.native
  def bulkInsert(tableName: SchemaTableName, records: js.Array[js.Object]): typings.bluebird.mod.^[js.Object] = js.native
  def bulkInsert(
    tableName: SchemaTableName,
    records: js.Array[js.Object],
    options: js.UndefOr[scala.Nothing],
    attributes: String
  ): typings.bluebird.mod.^[js.Object] = js.native
  def bulkInsert(
    tableName: SchemaTableName,
    records: js.Array[js.Object],
    options: js.UndefOr[scala.Nothing],
    attributes: js.Array[String]
  ): typings.bluebird.mod.^[js.Object] = js.native
  def bulkInsert(tableName: SchemaTableName, records: js.Array[js.Object], options: QueryOptions): typings.bluebird.mod.^[js.Object] = js.native
  def bulkInsert(
    tableName: SchemaTableName,
    records: js.Array[js.Object],
    options: QueryOptions,
    attributes: String
  ): typings.bluebird.mod.^[js.Object] = js.native
  def bulkInsert(
    tableName: SchemaTableName,
    records: js.Array[js.Object],
    options: QueryOptions,
    attributes: js.Array[String]
  ): typings.bluebird.mod.^[js.Object] = js.native
  
  /**
    * Updates multiple rows at once
    */
  def bulkUpdate(tableName: String, values: js.Object, identifier: js.Object): typings.bluebird.mod.^[js.Object] = js.native
  def bulkUpdate(
    tableName: String,
    values: js.Object,
    identifier: js.Object,
    options: js.UndefOr[scala.Nothing],
    attributes: String
  ): typings.bluebird.mod.^[js.Object] = js.native
  def bulkUpdate(
    tableName: String,
    values: js.Object,
    identifier: js.Object,
    options: js.UndefOr[scala.Nothing],
    attributes: js.Array[String]
  ): typings.bluebird.mod.^[js.Object] = js.native
  def bulkUpdate(tableName: String, values: js.Object, identifier: js.Object, options: QueryOptions): typings.bluebird.mod.^[js.Object] = js.native
  def bulkUpdate(
    tableName: String,
    values: js.Object,
    identifier: js.Object,
    options: QueryOptions,
    attributes: String
  ): typings.bluebird.mod.^[js.Object] = js.native
  def bulkUpdate(
    tableName: String,
    values: js.Object,
    identifier: js.Object,
    options: QueryOptions,
    attributes: js.Array[String]
  ): typings.bluebird.mod.^[js.Object] = js.native
  
  /**
    * Changes a column
    */
  def changeColumn(tableName: String, attributeName: String): typings.bluebird.mod.^[Unit] = js.native
  def changeColumn(
    tableName: String,
    attributeName: String,
    dataTypeOrOptions: js.UndefOr[scala.Nothing],
    options: QueryInterfaceOptions
  ): typings.bluebird.mod.^[Unit] = js.native
  def changeColumn(tableName: String, attributeName: String, dataTypeOrOptions: String): typings.bluebird.mod.^[Unit] = js.native
  def changeColumn(
    tableName: String,
    attributeName: String,
    dataTypeOrOptions: String,
    options: QueryInterfaceOptions
  ): typings.bluebird.mod.^[Unit] = js.native
  def changeColumn(tableName: String, attributeName: String, dataTypeOrOptions: DataTypeAbstract): typings.bluebird.mod.^[Unit] = js.native
  def changeColumn(
    tableName: String,
    attributeName: String,
    dataTypeOrOptions: DataTypeAbstract,
    options: QueryInterfaceOptions
  ): typings.bluebird.mod.^[Unit] = js.native
  def changeColumn(tableName: String, attributeName: String, dataTypeOrOptions: DefineAttributeColumnOptions): typings.bluebird.mod.^[Unit] = js.native
  def changeColumn(
    tableName: String,
    attributeName: String,
    dataTypeOrOptions: DefineAttributeColumnOptions,
    options: QueryInterfaceOptions
  ): typings.bluebird.mod.^[Unit] = js.native
  def changeColumn(tableName: Schema, attributeName: String): typings.bluebird.mod.^[Unit] = js.native
  def changeColumn(
    tableName: Schema,
    attributeName: String,
    dataTypeOrOptions: js.UndefOr[scala.Nothing],
    options: QueryInterfaceOptions
  ): typings.bluebird.mod.^[Unit] = js.native
  def changeColumn(tableName: Schema, attributeName: String, dataTypeOrOptions: String): typings.bluebird.mod.^[Unit] = js.native
  def changeColumn(
    tableName: Schema,
    attributeName: String,
    dataTypeOrOptions: String,
    options: QueryInterfaceOptions
  ): typings.bluebird.mod.^[Unit] = js.native
  def changeColumn(tableName: Schema, attributeName: String, dataTypeOrOptions: DataTypeAbstract): typings.bluebird.mod.^[Unit] = js.native
  def changeColumn(
    tableName: Schema,
    attributeName: String,
    dataTypeOrOptions: DataTypeAbstract,
    options: QueryInterfaceOptions
  ): typings.bluebird.mod.^[Unit] = js.native
  def changeColumn(tableName: Schema, attributeName: String, dataTypeOrOptions: DefineAttributeColumnOptions): typings.bluebird.mod.^[Unit] = js.native
  def changeColumn(
    tableName: Schema,
    attributeName: String,
    dataTypeOrOptions: DefineAttributeColumnOptions,
    options: QueryInterfaceOptions
  ): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Commit an already started transaction
    */
  def commitTransaction(transaction: Transaction): typings.bluebird.mod.^[Unit] = js.native
  def commitTransaction(transaction: Transaction, options: QueryOptions): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Postgres only. Create a function
    */
  def createFunction(functionName: String, params: js.Array[_], returnType: String, language: String, body: String): typings.bluebird.mod.^[Unit] = js.native
  def createFunction(
    functionName: String,
    params: js.Array[_],
    returnType: String,
    language: String,
    body: String,
    options: QueryOptions
  ): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Queries the schema (table list).
    *
    * @param schema The schema to query. Applies only to Postgres.
    */
  def createSchema(): typings.bluebird.mod.^[Unit] = js.native
  def createSchema(schema: js.UndefOr[scala.Nothing], options: QueryInterfaceOptions): typings.bluebird.mod.^[Unit] = js.native
  def createSchema(schema: String): typings.bluebird.mod.^[Unit] = js.native
  def createSchema(schema: String, options: QueryInterfaceOptions): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Creates a table with specified attributes.
    *
    * @param tableName     Name of table to create
    * @param attributes    Hash of attributes, key is attribute name, value is data type
    * @param options       Query options.
    */
  def createTable(tableName: String, attributes: DefineAttributes): typings.bluebird.mod.^[Unit] = js.native
  def createTable(tableName: String, attributes: DefineAttributes, options: QueryOptions): typings.bluebird.mod.^[Unit] = js.native
  def createTable(tableName: Schema, attributes: DefineAttributes): typings.bluebird.mod.^[Unit] = js.native
  def createTable(tableName: Schema, attributes: DefineAttributes, options: QueryOptions): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Postgres only. Creates a trigger on specified table to call the specified function with supplied
    * parameters.
    */
  def createTrigger(
    tableName: String,
    triggerName: String,
    timingType: String,
    fireOnArray: js.Array[_],
    functionName: String,
    functionParams: js.Array[_],
    optionsArray: js.Array[String]
  ): typings.bluebird.mod.^[Unit] = js.native
  def createTrigger(
    tableName: String,
    triggerName: String,
    timingType: String,
    fireOnArray: js.Array[_],
    functionName: String,
    functionParams: js.Array[_],
    optionsArray: js.Array[String],
    options: QueryInterfaceOptions
  ): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Return database version
    */
  def databaseVersion(): typings.bluebird.mod.^[String] = js.native
  def databaseVersion(options: QueryInterfaceOptions): typings.bluebird.mod.^[String] = js.native
  
  /**
    * Defer constraints
    */
  def deferConstraints(transaction: Transaction): typings.bluebird.mod.^[Unit] = js.native
  def deferConstraints(transaction: Transaction, options: QueryOptions): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Deletes a row
    */
  def delete(instance: Instance[_], tableName: String, identifier: js.Object): typings.bluebird.mod.^[js.Object] = js.native
  def delete(instance: Instance[_], tableName: String, identifier: js.Object, options: QueryOptions): typings.bluebird.mod.^[js.Object] = js.native
  
  /**
    * Describe a table
    */
  def describeTable(tableName: String): typings.bluebird.mod.^[js.Object] = js.native
  def describeTable(tableName: String, options: String): typings.bluebird.mod.^[js.Object] = js.native
  def describeTable(tableName: String, options: Logging): typings.bluebird.mod.^[js.Object] = js.native
  def describeTable(tableName: Schema): typings.bluebird.mod.^[js.Object] = js.native
  def describeTable(tableName: Schema, options: String): typings.bluebird.mod.^[js.Object] = js.native
  def describeTable(tableName: Schema, options: Logging): typings.bluebird.mod.^[js.Object] = js.native
  
  /**
    * Drops all defined enums
    *
    * @param options
    */
  def dropAllEnums(): typings.bluebird.mod.^[Unit] = js.native
  def dropAllEnums(options: QueryOptions): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Drops all tables.
    */
  def dropAllSchemas(): typings.bluebird.mod.^[Unit] = js.native
  def dropAllSchemas(options: QueryInterfaceOptions): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Drops all tables.
    *
    * @param options
    */
  def dropAllTables(): typings.bluebird.mod.^[Unit] = js.native
  def dropAllTables(options: QueryOptions): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Postgres only. Drops a function
    */
  def dropFunction(functionName: String, params: js.Array[_]): typings.bluebird.mod.^[Unit] = js.native
  def dropFunction(functionName: String, params: js.Array[_], options: QueryInterfaceOptions): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Drops the specified schema (table).
    *
    * @param schema The schema to query. Applies only to Postgres.
    */
  def dropSchema(): typings.bluebird.mod.^[Unit] = js.native
  def dropSchema(schema: js.UndefOr[scala.Nothing], options: QueryInterfaceOptions): typings.bluebird.mod.^[Unit] = js.native
  def dropSchema(schema: String): typings.bluebird.mod.^[Unit] = js.native
  def dropSchema(schema: String, options: QueryInterfaceOptions): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Drops the specified table.
    *
    * @param tableName Table name.
    * @param options   Query options, particularly "force".
    */
  def dropTable(tableName: String): typings.bluebird.mod.^[Unit] = js.native
  def dropTable(tableName: String, options: QueryOptions): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Postgres only. Drops the specified trigger.
    */
  def dropTrigger(tableName: String, triggerName: String): typings.bluebird.mod.^[Unit] = js.native
  def dropTrigger(tableName: String, triggerName: String, options: QueryInterfaceOptions): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Escape a value (e.g. a string, number or date)
    */
  def escape(): String = js.native
  def escape(value: String): String = js.native
  def escape(value: Double): String = js.native
  def escape(value: Date): String = js.native
  
  /**
    * Returns all foreign key constraints of each table in list
    */
  def getForeignKeysForTables(tableNames: js.Array[String]): typings.bluebird.mod.^[js.Object] = js.native
  def getForeignKeysForTables(tableNames: js.Array[String], options: QueryInterfaceOptions): typings.bluebird.mod.^[js.Object] = js.native
  
  /**
    * Increments a row value
    */
  def increment(instance: Instance[_], tableName: String, values: js.Object, identifier: js.Object): typings.bluebird.mod.^[js.Object] = js.native
  def increment(
    instance: Instance[_],
    tableName: String,
    values: js.Object,
    identifier: js.Object,
    options: QueryOptions
  ): typings.bluebird.mod.^[js.Object] = js.native
  
  /**
    * Inserts a new record
    */
  def insert(instance: Instance[_], tableName: String, values: js.Object): typings.bluebird.mod.^[js.Object] = js.native
  def insert(instance: Instance[_], tableName: String, values: js.Object, options: QueryOptions): typings.bluebird.mod.^[js.Object] = js.native
  
  /**
    * Put a name to an index
    */
  def nameIndexes(indexes: js.Array[String], rawTablename: String): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Escape an identifier (e.g. a table or attribute name). If force is true, the identifier will be quoted
    * even if the `quoteIdentifiers` option is false.
    */
  def quoteIdentifier(identifier: String, force: Boolean): String = js.native
  
  /**
    * Split an identifier into .-separated tokens and quote each part. If force is true, the identifier will be
    * quoted even if the `quoteIdentifiers` option is false.
    */
  def quoteIdentifiers(identifiers: String, force: Boolean): String = js.native
  
  /**
    * Escape a table name
    */
  def quoteTable(identifier: String): String = js.native
  
  /**
    * Selects raw without parsing the string into an object
    */
  def rawSelect(tableName: String, options: QueryOptions, attributeSelector: String): typings.bluebird.mod.^[js.Array[String]] = js.native
  def rawSelect(tableName: String, options: QueryOptions, attributeSelector: String, model: Model[_, _, _]): typings.bluebird.mod.^[js.Array[String]] = js.native
  def rawSelect(tableName: String, options: QueryOptions, attributeSelector: js.Array[String]): typings.bluebird.mod.^[js.Array[String]] = js.native
  def rawSelect(
    tableName: String,
    options: QueryOptions,
    attributeSelector: js.Array[String],
    model: Model[_, _, _]
  ): typings.bluebird.mod.^[js.Array[String]] = js.native
  
  /**
    * Removes a column from a table
    */
  def removeColumn(tableName: String, attribute: String): typings.bluebird.mod.^[Unit] = js.native
  def removeColumn(tableName: String, attribute: String, options: QueryInterfaceOptions): typings.bluebird.mod.^[Unit] = js.native
  def removeColumn(tableName: TableName, attribute: String): typings.bluebird.mod.^[Unit] = js.native
  def removeColumn(tableName: TableName, attribute: String, options: QueryInterfaceOptions): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Removes constraints from a table
    */
  def removeConstraint(tableName: String, constraintName: String): typings.bluebird.mod.^[Unit] = js.native
  def removeConstraint(tableName: String, constraintName: String, options: QueryInterfaceOptions): typings.bluebird.mod.^[Unit] = js.native
  
  def removeIndex(tableName: String, indexNameOrAttributes: String): typings.bluebird.mod.^[Unit] = js.native
  def removeIndex(tableName: String, indexNameOrAttributes: String, options: QueryInterfaceOptions): typings.bluebird.mod.^[Unit] = js.native
  /**
    * Removes an index of a table
    */
  def removeIndex(tableName: String, indexNameOrAttributes: js.Array[String]): typings.bluebird.mod.^[Unit] = js.native
  def removeIndex(tableName: String, indexNameOrAttributes: js.Array[String], options: QueryInterfaceOptions): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Renames a column
    */
  def renameColumn(tableName: String, attrNameBefore: String, attrNameAfter: String): typings.bluebird.mod.^[Unit] = js.native
  def renameColumn(tableName: String, attrNameBefore: String, attrNameAfter: String, options: QueryInterfaceOptions): typings.bluebird.mod.^[Unit] = js.native
  def renameColumn(tableName: Schema, attrNameBefore: String, attrNameAfter: String): typings.bluebird.mod.^[Unit] = js.native
  def renameColumn(tableName: Schema, attrNameBefore: String, attrNameAfter: String, options: QueryInterfaceOptions): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Postgres only. Rename a function
    */
  def renameFunction(oldFunctionName: String, params: js.Array[_], newFunctionName: String): typings.bluebird.mod.^[Unit] = js.native
  def renameFunction(
    oldFunctionName: String,
    params: js.Array[_],
    newFunctionName: String,
    options: QueryInterfaceOptions
  ): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Renames a table
    */
  def renameTable(before: String, after: String): typings.bluebird.mod.^[Unit] = js.native
  def renameTable(before: String, after: String, options: QueryInterfaceOptions): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Postgres only. Renames a trigger
    */
  def renameTrigger(tableName: String, oldTriggerName: String, newTriggerName: String): typings.bluebird.mod.^[Unit] = js.native
  def renameTrigger(tableName: String, oldTriggerName: String, newTriggerName: String, options: QueryInterfaceOptions): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Rollback ( revert ) a transaction that has'nt been commited
    */
  def rollbackTransaction(transaction: Transaction): typings.bluebird.mod.^[Unit] = js.native
  def rollbackTransaction(transaction: Transaction, options: QueryOptions): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Returns selected rows
    */
  def select(model: Model[_, _, _], tableName: String): typings.bluebird.mod.^[js.Array[js.Object]] = js.native
  def select(model: Model[_, _, _], tableName: String, options: QueryOptions): typings.bluebird.mod.^[js.Array[js.Object]] = js.native
  
  /**
    * Returns the current sequelize instance.
    */
  var sequelize: Sequelize = js.native
  
  /**
    * Set option for autocommit of a transaction
    */
  def setAutocommit(transaction: Transaction, value: Boolean): typings.bluebird.mod.^[Unit] = js.native
  def setAutocommit(transaction: Transaction, value: Boolean, options: QueryOptions): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Set the isolation level of a transaction
    */
  def setIsolationLevel(transaction: Transaction, value: String): typings.bluebird.mod.^[Unit] = js.native
  def setIsolationLevel(transaction: Transaction, value: String, options: QueryOptions): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Queries all table names in the database.
    *
    * @param options
    */
  def showAllSchemas(): typings.bluebird.mod.^[js.Object] = js.native
  def showAllSchemas(options: QueryOptions): typings.bluebird.mod.^[js.Object] = js.native
  
  /**
    * Returns all tables
    */
  def showAllTables(): typings.bluebird.mod.^[js.Array[String]] = js.native
  def showAllTables(options: QueryOptions): typings.bluebird.mod.^[js.Array[String]] = js.native
  
  /**
    * Shows the index of a table
    */
  def showIndex(tableName: String): typings.bluebird.mod.^[js.Object] = js.native
  def showIndex(tableName: String, options: QueryOptions): typings.bluebird.mod.^[js.Object] = js.native
  def showIndex(tableName: js.Object): typings.bluebird.mod.^[js.Object] = js.native
  def showIndex(tableName: js.Object, options: QueryOptions): typings.bluebird.mod.^[js.Object] = js.native
  
  /**
    * Begin a new transaction
    */
  def startTransaction(transaction: Transaction): typings.bluebird.mod.^[Unit] = js.native
  def startTransaction(transaction: Transaction, options: QueryOptions): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Updates a row
    */
  def update(instance: Instance[_], tableName: String, values: js.Object, identifier: js.Object): typings.bluebird.mod.^[js.Object] = js.native
  def update(
    instance: Instance[_],
    tableName: String,
    values: js.Object,
    identifier: js.Object,
    options: QueryOptions
  ): typings.bluebird.mod.^[js.Object] = js.native
  
  /**
    * Inserts or Updates a record in the database
    */
  def upsert(tableName: String, values: js.Object, updateValues: js.Object, model: Model[_, _, _]): typings.bluebird.mod.^[js.Object] = js.native
  def upsert(
    tableName: String,
    values: js.Object,
    updateValues: js.Object,
    model: Model[_, _, _],
    options: QueryOptions
  ): typings.bluebird.mod.^[js.Object] = js.native
}
