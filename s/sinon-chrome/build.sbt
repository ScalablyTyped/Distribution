organization := "org.scalablytyped"
name := "sinon-chrome"
version := "v2.2.4-dt-20190322Z-0fdd4e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20190520Z-1fa4d2",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20190322Z-fe73d4",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20190322Z-70322a",
  "org.scalablytyped" %%% "sinon" % "7.0-dt-20190525Z-bd2b33",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        