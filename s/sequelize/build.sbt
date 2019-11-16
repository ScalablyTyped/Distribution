organization := "org.scalablytyped"
name := "sequelize"
version := "4.28.0-dt-20191014Z-ffa3a7"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20191111Z-35b9bf",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20190813Z-bfb9ae",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20191115Z-a45339",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191115Z-3b62fb",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "validator" % "v10.11.0-dt-20190819Z-d0446a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        