package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The interface that Sequelize uses to talk to all databases.
     *
     * This interface is available through sequelize.QueryInterface. It should not be commonly used, but it's
     * referenced anyway, so it can be used.
     */
@js.native
trait QueryInterface extends js.Object {
  /**
           * Returns the dialect-specific sql generator.
           *
           * We don't have a definition for the QueryGenerator, because I doubt it is commonly in use separately.
           */
  var QueryGenerator: js.Any = js.native
  /**
           * Returns the current sequelize instance.
           */
  var sequelize: Sequelize = js.native
  /**
           * Adds a new column to a table
           */
  def addColumn(tableName: java.lang.String, key: java.lang.String, attribute: DataTypeAbstract): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Adds a new column to a table
           */
  def addColumn(
    tableName: java.lang.String,
    key: java.lang.String,
    attribute: DataTypeAbstract,
    options: QueryInterfaceOptions
  ): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Adds a new column to a table
           */
  def addColumn(tableName: java.lang.String, key: java.lang.String, attribute: DefineAttributeColumnOptions): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Adds a new column to a table
           */
  def addColumn(
    tableName: java.lang.String,
    key: java.lang.String,
    attribute: DefineAttributeColumnOptions,
    options: QueryInterfaceOptions
  ): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Adds a new column to a table
           */
  def addColumn(tableName: sequelizeLib.Anon_TableName, key: java.lang.String, attribute: DataTypeAbstract): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Adds a new column to a table
           */
  def addColumn(
    tableName: sequelizeLib.Anon_TableName,
    key: java.lang.String,
    attribute: DataTypeAbstract,
    options: QueryInterfaceOptions
  ): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Adds a new column to a table
           */
  def addColumn(
    tableName: sequelizeLib.Anon_TableName,
    key: java.lang.String,
    attribute: DefineAttributeColumnOptions
  ): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Adds a new column to a table
           */
  def addColumn(
    tableName: sequelizeLib.Anon_TableName,
    key: java.lang.String,
    attribute: DefineAttributeColumnOptions,
    options: QueryInterfaceOptions
  ): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Adds constraints to a table
           */
  def addConstraint(tableName: java.lang.String, attributes: js.Array[java.lang.String]): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Adds constraints to a table
           */
  def addConstraint(tableName: java.lang.String, attributes: js.Array[java.lang.String], options: AddConstraintOptions): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Adds constraints to a table
           */
  def addConstraint(
    tableName: java.lang.String,
    attributes: js.Array[java.lang.String],
    options: QueryInterfaceOptions
  ): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Adds a new index to a table
           */
  def addIndex(tableName: java.lang.String, attributes: js.Array[java.lang.String]): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Adds a new index to a table
           */
  def addIndex(tableName: java.lang.String, attributes: js.Array[java.lang.String], options: DefineIndexOptions): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Adds a new index to a table
           */
  def addIndex(
    tableName: java.lang.String,
    attributes: js.Array[java.lang.String],
    options: DefineIndexOptions,
    rawTablename: java.lang.String
  ): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Adds a new index to a table
           */
  def addIndex(tableName: js.Object, attributes: js.Array[java.lang.String]): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Adds a new index to a table
           */
  def addIndex(tableName: js.Object, attributes: js.Array[java.lang.String], options: DefineIndexOptions): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Adds a new index to a table
           */
  def addIndex(
    tableName: js.Object,
    attributes: js.Array[java.lang.String],
    options: DefineIndexOptions,
    rawTablename: java.lang.String
  ): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Deletes multiple rows at once
           */
  def bulkDelete(tableName: java.lang.String, identifier: js.Object): bluebirdLib.bluebirdMod.namespaced[js.Object] = js.native
  /**
           * Deletes multiple rows at once
           */
  def bulkDelete(tableName: java.lang.String, identifier: js.Object, options: QueryOptions): bluebirdLib.bluebirdMod.namespaced[js.Object] = js.native
  /**
           * Deletes multiple rows at once
           */
  def bulkDelete(tableName: java.lang.String, identifier: js.Object, options: QueryOptions, model: Model[_, _]): bluebirdLib.bluebirdMod.namespaced[js.Object] = js.native
  /**
           * Inserts multiple records at once
           */
  def bulkInsert(tableName: java.lang.String, records: js.Array[js.Object]): bluebirdLib.bluebirdMod.namespaced[js.Object] = js.native
  /**
           * Inserts multiple records at once
           */
  def bulkInsert(tableName: java.lang.String, records: js.Array[js.Object], options: QueryOptions): bluebirdLib.bluebirdMod.namespaced[js.Object] = js.native
  /**
           * Inserts multiple records at once
           */
  def bulkInsert(
    tableName: java.lang.String,
    records: js.Array[js.Object],
    options: QueryOptions,
    attributes: java.lang.String
  ): bluebirdLib.bluebirdMod.namespaced[js.Object] = js.native
  /**
           * Inserts multiple records at once
           */
  def bulkInsert(
    tableName: java.lang.String,
    records: js.Array[js.Object],
    options: QueryOptions,
    attributes: js.Array[java.lang.String]
  ): bluebirdLib.bluebirdMod.namespaced[js.Object] = js.native
  /**
           * Updates multiple rows at once
           */
  def bulkUpdate(tableName: java.lang.String, values: js.Object, identifier: js.Object): bluebirdLib.bluebirdMod.namespaced[js.Object] = js.native
  /**
           * Updates multiple rows at once
           */
  def bulkUpdate(tableName: java.lang.String, values: js.Object, identifier: js.Object, options: QueryOptions): bluebirdLib.bluebirdMod.namespaced[js.Object] = js.native
  /**
           * Updates multiple rows at once
           */
  def bulkUpdate(
    tableName: java.lang.String,
    values: js.Object,
    identifier: js.Object,
    options: QueryOptions,
    attributes: java.lang.String
  ): bluebirdLib.bluebirdMod.namespaced[js.Object] = js.native
  /**
           * Updates multiple rows at once
           */
  def bulkUpdate(
    tableName: java.lang.String,
    values: js.Object,
    identifier: js.Object,
    options: QueryOptions,
    attributes: js.Array[java.lang.String]
  ): bluebirdLib.bluebirdMod.namespaced[js.Object] = js.native
  /**
           * Changes a column
           */
  def changeColumn(tableName: java.lang.String, attributeName: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Changes a column
           */
  def changeColumn(tableName: java.lang.String, attributeName: java.lang.String, dataTypeOrOptions: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Changes a column
           */
  def changeColumn(
    tableName: java.lang.String,
    attributeName: java.lang.String,
    dataTypeOrOptions: java.lang.String,
    options: QueryInterfaceOptions
  ): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Changes a column
           */
  def changeColumn(tableName: java.lang.String, attributeName: java.lang.String, dataTypeOrOptions: DataTypeAbstract): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Changes a column
           */
  def changeColumn(
    tableName: java.lang.String,
    attributeName: java.lang.String,
    dataTypeOrOptions: DataTypeAbstract,
    options: QueryInterfaceOptions
  ): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Changes a column
           */
  def changeColumn(
    tableName: java.lang.String,
    attributeName: java.lang.String,
    dataTypeOrOptions: DefineAttributeColumnOptions
  ): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Changes a column
           */
  def changeColumn(
    tableName: java.lang.String,
    attributeName: java.lang.String,
    dataTypeOrOptions: DefineAttributeColumnOptions,
    options: QueryInterfaceOptions
  ): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Changes a column
           */
  def changeColumn(tableName: sequelizeLib.Anon_TableName, attributeName: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Changes a column
           */
  def changeColumn(
    tableName: sequelizeLib.Anon_TableName,
    attributeName: java.lang.String,
    dataTypeOrOptions: java.lang.String
  ): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Changes a column
           */
  def changeColumn(
    tableName: sequelizeLib.Anon_TableName,
    attributeName: java.lang.String,
    dataTypeOrOptions: java.lang.String,
    options: QueryInterfaceOptions
  ): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Changes a column
           */
  def changeColumn(
    tableName: sequelizeLib.Anon_TableName,
    attributeName: java.lang.String,
    dataTypeOrOptions: DataTypeAbstract
  ): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Changes a column
           */
  def changeColumn(
    tableName: sequelizeLib.Anon_TableName,
    attributeName: java.lang.String,
    dataTypeOrOptions: DataTypeAbstract,
    options: QueryInterfaceOptions
  ): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Changes a column
           */
  def changeColumn(
    tableName: sequelizeLib.Anon_TableName,
    attributeName: java.lang.String,
    dataTypeOrOptions: DefineAttributeColumnOptions
  ): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Changes a column
           */
  def changeColumn(
    tableName: sequelizeLib.Anon_TableName,
    attributeName: java.lang.String,
    dataTypeOrOptions: DefineAttributeColumnOptions,
    options: QueryInterfaceOptions
  ): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Commit an already started transaction
           */
  def commitTransaction(transaction: Transaction): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Commit an already started transaction
           */
  def commitTransaction(transaction: Transaction, options: QueryOptions): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Postgres only. Create a function
           */
  def createFunction(
    functionName: java.lang.String,
    params: js.Array[_],
    returnType: java.lang.String,
    language: java.lang.String,
    body: java.lang.String
  ): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Postgres only. Create a function
           */
  def createFunction(
    functionName: java.lang.String,
    params: js.Array[_],
    returnType: java.lang.String,
    language: java.lang.String,
    body: java.lang.String,
    options: QueryOptions
  ): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Queries the schema (table list).
           *
           * @param schema The schema to query. Applies only to Postgres.
           */
  def createSchema(): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Queries the schema (table list).
           *
           * @param schema The schema to query. Applies only to Postgres.
           */
  def createSchema(schema: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Queries the schema (table list).
           *
           * @param schema The schema to query. Applies only to Postgres.
           */
  def createSchema(schema: java.lang.String, options: QueryInterfaceOptions): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Creates a table with specified attributes.
           *
           * @param tableName     Name of table to create
           * @param attributes    Hash of attributes, key is attribute name, value is data type
           * @param options       Query options.
           */
  def createTable(tableName: java.lang.String, attributes: DefineAttributes): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Creates a table with specified attributes.
           *
           * @param tableName     Name of table to create
           * @param attributes    Hash of attributes, key is attribute name, value is data type
           * @param options       Query options.
           */
  def createTable(tableName: java.lang.String, attributes: DefineAttributes, options: QueryOptions): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Creates a table with specified attributes.
           *
           * @param tableName     Name of table to create
           * @param attributes    Hash of attributes, key is attribute name, value is data type
           * @param options       Query options.
           */
  def createTable(tableName: sequelizeLib.Anon_TableName, attributes: DefineAttributes): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Creates a table with specified attributes.
           *
           * @param tableName     Name of table to create
           * @param attributes    Hash of attributes, key is attribute name, value is data type
           * @param options       Query options.
           */
  def createTable(tableName: sequelizeLib.Anon_TableName, attributes: DefineAttributes, options: QueryOptions): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Postgres only. Creates a trigger on specified table to call the specified function with supplied
           * parameters.
           */
  def createTrigger(
    tableName: java.lang.String,
    triggerName: java.lang.String,
    timingType: java.lang.String,
    fireOnArray: js.Array[_],
    functionName: java.lang.String,
    functionParams: js.Array[_],
    optionsArray: js.Array[java.lang.String]
  ): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Postgres only. Creates a trigger on specified table to call the specified function with supplied
           * parameters.
           */
  def createTrigger(
    tableName: java.lang.String,
    triggerName: java.lang.String,
    timingType: java.lang.String,
    fireOnArray: js.Array[_],
    functionName: java.lang.String,
    functionParams: js.Array[_],
    optionsArray: js.Array[java.lang.String],
    options: QueryInterfaceOptions
  ): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Return database version
           */
  def databaseVersion(): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  /**
           * Return database version
           */
  def databaseVersion(options: QueryInterfaceOptions): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  /**
           * Defer constraints
           */
  def deferConstraints(transaction: Transaction): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Defer constraints
           */
  def deferConstraints(transaction: Transaction, options: QueryOptions): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Deletes a row
           */
  def delete(instance: Instance[_], tableName: java.lang.String, identifier: js.Object): bluebirdLib.bluebirdMod.namespaced[js.Object] = js.native
  /**
           * Deletes a row
           */
  def delete(instance: Instance[_], tableName: java.lang.String, identifier: js.Object, options: QueryOptions): bluebirdLib.bluebirdMod.namespaced[js.Object] = js.native
  /**
           * Describe a table
           */
  def describeTable(tableName: java.lang.String): bluebirdLib.bluebirdMod.namespaced[js.Object] = js.native
  /**
           * Describe a table
           */
  def describeTable(tableName: java.lang.String, options: java.lang.String): bluebirdLib.bluebirdMod.namespaced[js.Object] = js.native
  /**
           * Describe a table
           */
  def describeTable(tableName: java.lang.String, options: sequelizeLib.Anon_SchemaDelimeter): bluebirdLib.bluebirdMod.namespaced[js.Object] = js.native
  /**
           * Describe a table
           */
  def describeTable(tableName: sequelizeLib.Anon_TableName): bluebirdLib.bluebirdMod.namespaced[js.Object] = js.native
  /**
           * Describe a table
           */
  def describeTable(tableName: sequelizeLib.Anon_TableName, options: java.lang.String): bluebirdLib.bluebirdMod.namespaced[js.Object] = js.native
  /**
           * Describe a table
           */
  def describeTable(tableName: sequelizeLib.Anon_TableName, options: sequelizeLib.Anon_SchemaDelimeter): bluebirdLib.bluebirdMod.namespaced[js.Object] = js.native
  /**
           * Drops all defined enums
           *
           * @param options
           */
  def dropAllEnums(): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Drops all defined enums
           *
           * @param options
           */
  def dropAllEnums(options: QueryOptions): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Drops all tables.
           */
  def dropAllSchemas(): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Drops all tables.
           */
  def dropAllSchemas(options: QueryInterfaceOptions): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Drops all tables.
           *
           * @param options
           */
  def dropAllTables(): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Drops all tables.
           *
           * @param options
           */
  def dropAllTables(options: QueryOptions): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Postgres only. Drops a function
           */
  def dropFunction(functionName: java.lang.String, params: js.Array[_]): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Postgres only. Drops a function
           */
  def dropFunction(functionName: java.lang.String, params: js.Array[_], options: QueryInterfaceOptions): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Drops the specified schema (table).
           *
           * @param schema The schema to query. Applies only to Postgres.
           */
  def dropSchema(): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Drops the specified schema (table).
           *
           * @param schema The schema to query. Applies only to Postgres.
           */
  def dropSchema(schema: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Drops the specified schema (table).
           *
           * @param schema The schema to query. Applies only to Postgres.
           */
  def dropSchema(schema: java.lang.String, options: QueryInterfaceOptions): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Drops the specified table.
           *
           * @param tableName Table name.
           * @param options   Query options, particularly "force".
           */
  def dropTable(tableName: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Drops the specified table.
           *
           * @param tableName Table name.
           * @param options   Query options, particularly "force".
           */
  def dropTable(tableName: java.lang.String, options: QueryOptions): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Postgres only. Drops the specified trigger.
           */
  def dropTrigger(tableName: java.lang.String, triggerName: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Postgres only. Drops the specified trigger.
           */
  def dropTrigger(tableName: java.lang.String, triggerName: java.lang.String, options: QueryInterfaceOptions): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Escape a value (e.g. a string, number or date)
           */
  def escape(): java.lang.String = js.native
  /**
           * Escape a value (e.g. a string, number or date)
           */
  def escape(value: java.lang.String): java.lang.String = js.native
  /**
           * Escape a value (e.g. a string, number or date)
           */
  def escape(value: scala.Double): java.lang.String = js.native
  /**
           * Escape a value (e.g. a string, number or date)
           */
  def escape(value: stdLib.Date): java.lang.String = js.native
  /**
           * Returns all foreign key constraints of a table
           */
  def getForeignKeysForTables(tableNames: java.lang.String): bluebirdLib.bluebirdMod.namespaced[js.Object] = js.native
  /**
           * Returns all foreign key constraints of a table
           */
  def getForeignKeysForTables(tableNames: java.lang.String, options: QueryInterfaceOptions): bluebirdLib.bluebirdMod.namespaced[js.Object] = js.native
  /**
           * Increments a row value
           */
  def increment(instance: Instance[_], tableName: java.lang.String, values: js.Object, identifier: js.Object): bluebirdLib.bluebirdMod.namespaced[js.Object] = js.native
  /**
           * Increments a row value
           */
  def increment(
    instance: Instance[_],
    tableName: java.lang.String,
    values: js.Object,
    identifier: js.Object,
    options: QueryOptions
  ): bluebirdLib.bluebirdMod.namespaced[js.Object] = js.native
  /**
           * Inserts a new record
           */
  def insert(instance: Instance[_], tableName: java.lang.String, values: js.Object): bluebirdLib.bluebirdMod.namespaced[js.Object] = js.native
  /**
           * Inserts a new record
           */
  def insert(instance: Instance[_], tableName: java.lang.String, values: js.Object, options: QueryOptions): bluebirdLib.bluebirdMod.namespaced[js.Object] = js.native
  /**
           * Put a name to an index
           */
  def nameIndexes(indexes: js.Array[java.lang.String], rawTablename: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Escape an identifier (e.g. a table or attribute name). If force is true, the identifier will be quoted
           * even if the `quoteIdentifiers` option is false.
           */
  def quoteIdentifier(identifier: java.lang.String, force: scala.Boolean): java.lang.String = js.native
  /**
           * Split an identifier into .-separated tokens and quote each part. If force is true, the identifier will be
           * quoted even if the `quoteIdentifiers` option is false.
           */
  def quoteIdentifiers(identifiers: java.lang.String, force: scala.Boolean): java.lang.String = js.native
  /**
           * Escape a table name
           */
  def quoteTable(identifier: java.lang.String): java.lang.String = js.native
  /**
           * Selects raw without parsing the string into an object
           */
  def rawSelect(tableName: java.lang.String, options: QueryOptions, attributeSelector: java.lang.String): bluebirdLib.bluebirdMod.namespaced[js.Array[java.lang.String]] = js.native
  /**
           * Selects raw without parsing the string into an object
           */
  def rawSelect(
    tableName: java.lang.String,
    options: QueryOptions,
    attributeSelector: java.lang.String,
    model: Model[_, _]
  ): bluebirdLib.bluebirdMod.namespaced[js.Array[java.lang.String]] = js.native
  /**
           * Selects raw without parsing the string into an object
           */
  def rawSelect(tableName: java.lang.String, options: QueryOptions, attributeSelector: js.Array[java.lang.String]): bluebirdLib.bluebirdMod.namespaced[js.Array[java.lang.String]] = js.native
  /**
           * Selects raw without parsing the string into an object
           */
  def rawSelect(
    tableName: java.lang.String,
    options: QueryOptions,
    attributeSelector: js.Array[java.lang.String],
    model: Model[_, _]
  ): bluebirdLib.bluebirdMod.namespaced[js.Array[java.lang.String]] = js.native
  /**
           * Removes a column from a table
           */
  def removeColumn(tableName: java.lang.String, attribute: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Removes a column from a table
           */
  def removeColumn(tableName: java.lang.String, attribute: java.lang.String, options: QueryInterfaceOptions): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Removes a column from a table
           */
  def removeColumn(tableName: sequelizeLib.Anon_TableName, attribute: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Removes a column from a table
           */
  def removeColumn(
    tableName: sequelizeLib.Anon_TableName,
    attribute: java.lang.String,
    options: QueryInterfaceOptions
  ): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Removes constraints from a table
           */
  def removeConstraint(tableName: java.lang.String, constraintName: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Removes constraints from a table
           */
  def removeConstraint(tableName: java.lang.String, constraintName: java.lang.String, options: QueryInterfaceOptions): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Removes an index of a table
           */
  def removeIndex(tableName: java.lang.String, indexNameOrAttributes: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Removes an index of a table
           */
  def removeIndex(
    tableName: java.lang.String,
    indexNameOrAttributes: java.lang.String,
    options: QueryInterfaceOptions
  ): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Removes an index of a table
           */
  def removeIndex(tableName: java.lang.String, indexNameOrAttributes: js.Array[java.lang.String]): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Removes an index of a table
           */
  def removeIndex(
    tableName: java.lang.String,
    indexNameOrAttributes: js.Array[java.lang.String],
    options: QueryInterfaceOptions
  ): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Renames a column
           */
  def renameColumn(tableName: java.lang.String, attrNameBefore: java.lang.String, attrNameAfter: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Renames a column
           */
  def renameColumn(
    tableName: java.lang.String,
    attrNameBefore: java.lang.String,
    attrNameAfter: java.lang.String,
    options: QueryInterfaceOptions
  ): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Renames a column
           */
  def renameColumn(
    tableName: sequelizeLib.Anon_TableName,
    attrNameBefore: java.lang.String,
    attrNameAfter: java.lang.String
  ): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Renames a column
           */
  def renameColumn(
    tableName: sequelizeLib.Anon_TableName,
    attrNameBefore: java.lang.String,
    attrNameAfter: java.lang.String,
    options: QueryInterfaceOptions
  ): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Postgres only. Rename a function
           */
  def renameFunction(oldFunctionName: java.lang.String, params: js.Array[_], newFunctionName: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Postgres only. Rename a function
           */
  def renameFunction(
    oldFunctionName: java.lang.String,
    params: js.Array[_],
    newFunctionName: java.lang.String,
    options: QueryInterfaceOptions
  ): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Renames a table
           */
  def renameTable(before: java.lang.String, after: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Renames a table
           */
  def renameTable(before: java.lang.String, after: java.lang.String, options: QueryInterfaceOptions): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Postgres only. Renames a trigger
           */
  def renameTrigger(tableName: java.lang.String, oldTriggerName: java.lang.String, newTriggerName: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Postgres only. Renames a trigger
           */
  def renameTrigger(
    tableName: java.lang.String,
    oldTriggerName: java.lang.String,
    newTriggerName: java.lang.String,
    options: QueryInterfaceOptions
  ): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Rollback ( revert ) a transaction that has'nt been commited
           */
  def rollbackTransaction(transaction: Transaction): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Rollback ( revert ) a transaction that has'nt been commited
           */
  def rollbackTransaction(transaction: Transaction, options: QueryOptions): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Returns selected rows
           */
  def select(model: Model[_, _], tableName: java.lang.String): bluebirdLib.bluebirdMod.namespaced[js.Array[js.Object]] = js.native
  /**
           * Returns selected rows
           */
  def select(model: Model[_, _], tableName: java.lang.String, options: QueryOptions): bluebirdLib.bluebirdMod.namespaced[js.Array[js.Object]] = js.native
  /**
           * Set option for autocommit of a transaction
           */
  def setAutocommit(transaction: Transaction, value: scala.Boolean): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Set option for autocommit of a transaction
           */
  def setAutocommit(transaction: Transaction, value: scala.Boolean, options: QueryOptions): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Set the isolation level of a transaction
           */
  def setIsolationLevel(transaction: Transaction, value: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Set the isolation level of a transaction
           */
  def setIsolationLevel(transaction: Transaction, value: java.lang.String, options: QueryOptions): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Queries all table names in the database.
           *
           * @param options
           */
  def showAllSchemas(): bluebirdLib.bluebirdMod.namespaced[js.Object] = js.native
  /**
           * Queries all table names in the database.
           *
           * @param options
           */
  def showAllSchemas(options: QueryOptions): bluebirdLib.bluebirdMod.namespaced[js.Object] = js.native
  /**
           * Returns all tables
           */
  def showAllTables(): bluebirdLib.bluebirdMod.namespaced[js.Array[java.lang.String]] = js.native
  /**
           * Returns all tables
           */
  def showAllTables(options: QueryOptions): bluebirdLib.bluebirdMod.namespaced[js.Array[java.lang.String]] = js.native
  /**
           * Shows the index of a table
           */
  def showIndex(tableName: java.lang.String): bluebirdLib.bluebirdMod.namespaced[js.Object] = js.native
  /**
           * Shows the index of a table
           */
  def showIndex(tableName: java.lang.String, options: QueryOptions): bluebirdLib.bluebirdMod.namespaced[js.Object] = js.native
  /**
           * Shows the index of a table
           */
  def showIndex(tableName: js.Object): bluebirdLib.bluebirdMod.namespaced[js.Object] = js.native
  /**
           * Shows the index of a table
           */
  def showIndex(tableName: js.Object, options: QueryOptions): bluebirdLib.bluebirdMod.namespaced[js.Object] = js.native
  /**
           * Begin a new transaction
           */
  def startTransaction(transaction: Transaction): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Begin a new transaction
           */
  def startTransaction(transaction: Transaction, options: QueryOptions): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
           * Updates a row
           */
  def update(instance: Instance[_], tableName: java.lang.String, values: js.Object, identifier: js.Object): bluebirdLib.bluebirdMod.namespaced[js.Object] = js.native
  /**
           * Updates a row
           */
  def update(
    instance: Instance[_],
    tableName: java.lang.String,
    values: js.Object,
    identifier: js.Object,
    options: QueryOptions
  ): bluebirdLib.bluebirdMod.namespaced[js.Object] = js.native
  /**
           * Inserts or Updates a record in the database
           */
  def upsert(tableName: java.lang.String, values: js.Object, updateValues: js.Object, model: Model[_, _]): bluebirdLib.bluebirdMod.namespaced[js.Object] = js.native
  /**
           * Inserts or Updates a record in the database
           */
  def upsert(
    tableName: java.lang.String,
    values: js.Object,
    updateValues: js.Object,
    model: Model[_, _],
    options: QueryOptions
  ): bluebirdLib.bluebirdMod.namespaced[js.Object] = js.native
}

